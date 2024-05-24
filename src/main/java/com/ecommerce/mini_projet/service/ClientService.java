package com.ecommerce.mini_projet.service;

import com.ecommerce.mini_projet.Repository.ClientRepository;
import com.ecommerce.mini_projet.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ClientService {

    private  final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }
    public List<Client> getClient(){

        return clientRepository.findAll();

    }
    public Client addClient(Client client){
        return clientRepository.save(client);
    }
    public Client getClientById(Long id){
        return clientRepository.findById(id).orElse(null);
    }
    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }

    public Client updateClient(Long id,Client updateClient)
    { Client existingClient=getClientById(id);
        return clientRepository.save(existingClient);
    }

}

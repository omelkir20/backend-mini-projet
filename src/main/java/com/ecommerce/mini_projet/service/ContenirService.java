package com.ecommerce.mini_projet.service;

import com.ecommerce.mini_projet.Repository.ClientRepository;
import com.ecommerce.mini_projet.Repository.ContenirRepository;
import com.ecommerce.mini_projet.model.Client;
import com.ecommerce.mini_projet.model.Contenir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContenirService  {
    private  final ContenirRepository contenirRepository;
    @Autowired
    public ContenirService(ContenirRepository contenirRepository){
        this.contenirRepository=contenirRepository;
    }
    public List<Contenir> getContenir(){

        return contenirRepository.findAll();

    }
    public Contenir addContenir(Contenir contenir){
        return contenirRepository.save(contenir);
    }
    public Contenir getContenirById(Long id){
        return contenirRepository.findById(id).orElse(null);
    }
    public void deleteContenir(Long id){
        contenirRepository.deleteById(id);
    }

    public Contenir updateContenir(Long id,Contenir updateContenir)
    { Contenir existingContenir=getContenirById(id);
        return contenirRepository.save(existingContenir);
    }

}
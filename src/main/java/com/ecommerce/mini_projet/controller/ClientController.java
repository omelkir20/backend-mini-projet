package com.ecommerce.mini_projet.controller;

import com.ecommerce.mini_projet.model.Client;
import com.ecommerce.mini_projet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin (origins = "*")
@RestController
@RequestMapping("/api")
public class ClientController {
    private final ClientService clientService;
    @Autowired
    public ClientController(ClientService clientService){
        this.clientService=clientService;
    }
    @GetMapping("/clients")
    public List<Client> getClient(){
        return clientService.getClient();
    }
    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable Long id){
        return  clientService.getClientById(id);
    }
    @PostMapping("/clients")
    public Client addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }
    @PutMapping("/clients/{id}")
    public Client updateClient(@PathVariable Long id,@RequestBody Client updateClient){
        return clientService.updateClient(id,updateClient);
    }
    @DeleteMapping("/clients/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }

}

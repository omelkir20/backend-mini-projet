package com.ecommerce.mini_projet.controller;

import com.ecommerce.mini_projet.model.Client;
import com.ecommerce.mini_projet.model.Commande;
import com.ecommerce.mini_projet.service.ClientService;
import com.ecommerce.mini_projet.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CommandeController {
    private final CommandeService commandeService;
    @Autowired
    public CommandeController(CommandeService commandeService){
        this.commandeService=commandeService;
    }
    @GetMapping("/commandes")
    public List<Commande> getCommande(){
        return commandeService.getCommande();
    }
    @GetMapping("/commandes/{id}")
    public Commande getCommandeById(@PathVariable Long id){
        return commandeService.getCommandeById(id);
    }
    @PostMapping("/commandes")
    public Commande addCommende(@RequestBody Commande commande){
        return commandeService.addCommende(commande);
    }
    @PutMapping("/commandes/{id}")
    public Commande updateCommande(@PathVariable Long id,@RequestBody Commande updateCommande){
        return commandeService.updateCommande(id,updateCommande);
    }
    @DeleteMapping("/commandes/{id}")
    public ResponseEntity<Void> deleteCommande(@PathVariable Long id){
        commandeService.deleteCommande(id);
        return ResponseEntity.noContent().build();
    }

}

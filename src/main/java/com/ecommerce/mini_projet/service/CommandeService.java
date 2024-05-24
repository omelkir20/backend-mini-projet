package com.ecommerce.mini_projet.service;

import com.ecommerce.mini_projet.Repository.CommandeRepositoey;
import com.ecommerce.mini_projet.model.Client;
import com.ecommerce.mini_projet.model.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    private final CommandeRepositoey commandeRepositoey;
    @Autowired
    public CommandeService(CommandeRepositoey commandeRepositoey){
        this.commandeRepositoey=commandeRepositoey;
    }
    public List<Commande> getCommande(){
        return commandeRepositoey.findAll();
    }
    public Commande addCommende(Commande commande){
        return commandeRepositoey.save(commande);
    }
    public Commande getCommandeById(Long id){
        return commandeRepositoey.findById(id).orElse(null);
    }
    public void deleteCommande(Long id){
        commandeRepositoey.deleteById(id);
    }

    public Commande updateCommande(Long id,Commande updateCommande)
    { Commande existingCommande=getCommandeById(id);
        return commandeRepositoey.save(existingCommande);
    }
}

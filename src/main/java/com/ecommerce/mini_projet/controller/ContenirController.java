package com.ecommerce.mini_projet.controller;

import com.ecommerce.mini_projet.model.Contenir;
import com.ecommerce.mini_projet.service.ContenirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ContenirController {
    private final ContenirService contenirService;
    @Autowired
    public ContenirController(ContenirService contenirService){
        this.contenirService=contenirService;
    }
    @GetMapping("/contenir")
    public List<Contenir> getContenir(){
        return contenirService.getContenir();
    }
    @GetMapping("/contenir/{id}")
    public Contenir getContenirById(@PathVariable Long id){
        return contenirService.getContenirById(id);
    }
    @PostMapping("/contenir")
    public Contenir addContenir(@RequestBody Contenir contenir){
        return contenirService.addContenir(contenir);
    }
    @PutMapping("/contenir/{id}")
    public Contenir updateContenir(@PathVariable Long id,@RequestBody Contenir updateContenir){
        return contenirService.updateContenir(id,updateContenir);
    }
    @DeleteMapping("/contenir/{id}")
    public ResponseEntity<Void> deleteContenir(@PathVariable Long id){
        contenirService.deleteContenir(id);
        return ResponseEntity.noContent().build();
    }

}

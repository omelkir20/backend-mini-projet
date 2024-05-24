package com.ecommerce.mini_projet.Repository;

import com.ecommerce.mini_projet.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepositoey extends JpaRepository<Commande,Long> {
}

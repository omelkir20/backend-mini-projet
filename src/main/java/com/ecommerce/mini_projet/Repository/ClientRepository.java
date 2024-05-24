package com.ecommerce.mini_projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.mini_projet.model.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}

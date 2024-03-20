package org.example.firstproject.dao.repositories;

import org.example.firstproject.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    public List<Product> findByName(String name);
    public List<Product> findByDescription(String description);
    public List<Product> findByPrice(double price);

}

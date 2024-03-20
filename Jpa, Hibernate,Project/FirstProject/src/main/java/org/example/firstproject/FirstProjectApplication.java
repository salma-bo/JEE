package org.example.firstproject;

import org.example.firstproject.dao.entities.Product;
import org.example.firstproject.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner  {
    @Autowired
    private ProductRepository productRepository;



    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        Product product =new Product(1L,"P1","Produit 1",70);
        productRepository.save(product);
        System.out.println("Voici tous les produits");
        List<Product> Products  = productRepository.findAll();
        Products.forEach(productFromList -> {
            System.out.println(productFromList.toString());
        });
        System.out.println("Voici le produit by l'id");
        Product productbyid = productRepository.findById(1).get();
        System.out.println(productbyid);
//Update
        Product updateProduct=new Product(2L,"P2","Produit2",54);
        productRepository.save(updateProduct);
        Product ProductUpdateById=productRepository.findById(2).get();
        System.out.println("Voici le produit");
        System.out.println(ProductUpdateById);
        System.out.println("Voici le produit modifier");
        updateProduct.setDescription("Produit 2_1");
        productRepository.save(updateProduct);
        ProductUpdateById=productRepository.findById(2).get();
        System.out.println(ProductUpdateById);
//Delete
        Product produitdelete = new Product(3L, "P3", "Produit3",100);
        productRepository.save(produitdelete);
        System.out.println("Voici le produit à supprimer");
        System.out.println(productRepository.findById(3).get());
        productRepository.delete(produitdelete);
        try {
            System.out.println(productRepository.findById(3).get());
        } catch (Exception exception) {
            System.out.println("Le produit est supprimé");
        }

        System.out.println("Voici le produit par le nom");
        System.out.println(productRepository.findByName("P2"));
        System.out.println("Voici le produit par la description");
        System.out.println(productRepository.findByDescription("Produit 1"));
        System.out.println("Voici le produit par le prix");
        System.out.println(productRepository.findByPrice(100));
    }

}

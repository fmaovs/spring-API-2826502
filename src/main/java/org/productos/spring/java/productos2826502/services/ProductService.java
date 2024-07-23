package org.productos.spring.java.productos2826502.services;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    //inyectar la dependecia al repositorio
    private ProductRepository repository = new ProductRepository();

    //Operaciones de la logica de negocio
    //Casos de uso, historias de usuario
    // requieremientos funcionales
    public List<Product> findAllProducts(){
        return repository.findAll();
    }
}

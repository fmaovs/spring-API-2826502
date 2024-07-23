package org.productos.spring.java.productos2826502.repositories;


import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;
@Repository
public class ProductRepository {

    //la lista de un repositorio debe ser Inmutable
    List<Product> productos = List.of(
        Product.builder()
        .id(1L)
        .name("Silla Reclinable")
        .price(3773737.00)
        .build()
        ,
        new Product(2L, "Escritorio", 828271.00)
    );

    //Metodo para consultar todos los productos del repositorio
    public List<Product> findAll(){
        return this.productos;
    }
}

package org.productos.spring.java.productos2826502.repositories;
import java.util.List;

import org.productos.spring.java.productos2826502.entities.Category;
import org.springframework.stereotype.Repository;
@Repository
public class CategoryRepository {
    //la lista de un repositorio debe ser Inmutable
    List<Category> categorias = List.of(
        Category.builder()
        .id(1L)
        .name("Silla Reclinable")
        .build()
        ,
        new Category(123L, "Prueba categoria")
    );

    //Metodo para consultar todos los productos del repositorio
    public List<Category> findAll(){
        return this.categorias;
    }
}

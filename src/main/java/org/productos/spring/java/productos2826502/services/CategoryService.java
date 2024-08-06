package org.productos.spring.java.productos2826502.services;
import java.util.List;

import org.productos.spring.java.productos2826502.entities.Category;
import org.productos.spring.java.productos2826502.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    //inyectar la dependecia al repositorio
    private CategoryRepository repository = new CategoryRepository();

    //Operaciones de la logica de negocio
    //Casos de uso, historias de usuario
    // requieremientos funcionales
    public List<Category> findAllCategories(){
        return repository.findAll();
    }
}

package org.productos.spring.java.productos2826502.controllers;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Category;
import org.productos.spring.java.productos2826502.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api/categories/")
public class CategoryController {
    //inyectar el servicio
    private CategoryService service = new CategoryService();
    //primer endpoint
    //Endpoint: un metodo en un controlador
    @GetMapping("/saludo")
    public String Saludo(){
        return "Hola 2826502";
    }

    @GetMapping("/{idcategory}")
    public String findCategoryById(@PathVariable String idcategory) {
        return "Aqui se mostrara la categoria cuyo id es " + idcategory;
    }

    @GetMapping
    public List<Category> findAllCategories(){
        //Utilizo el servicio
        return service.findAllCategories();
    }
}

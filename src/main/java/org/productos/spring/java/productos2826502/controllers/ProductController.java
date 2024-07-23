package org.productos.spring.java.productos2826502.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api/products/")
public class ProductController {
    //inyectar el servicio
    private ProductService service = new ProductService();

    //primer endpoint
    //Endpoint: un metodo en un controlador
    @GetMapping("/saludo")
    public String Saludo(){
        return "Hola 2826502";
    }

    @GetMapping("/{idproducto}")
    public String findProductById(@PathVariable String idproducto) {
        return "Aqui se mostrara el producto cuyo id es " + idproducto;
    }

    @GetMapping
    public List<Product> findAllProducts(){
        //Utilizo el servicio
        return service.findAllProducts();
    }
    
}

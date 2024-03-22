package com.ecommerce.ecommercebackend.controllers;

import com.ecommerce.ecommercebackend.entities.Product;
import com.ecommerce.ecommercebackend.exceptions.ProductException;
import com.ecommerce.ecommercebackend.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(path = "products/", consumes = {"*/*"})
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // ResponseEntity permit to personalize your httpResponse

    @GetMapping(path = "")
    public List<Product> getProducts(){
        return this.productService.getProducts();
    }

    /*
       TODO
        Je veux une route en api/products/{idProduit}
        nom de la fonction : getProduct()
        parametre : idProduit
        retour : Product

        Pour aider tu vas avoir besoin de la propriete @PathVariable pour récupère le paramètre

     */


}

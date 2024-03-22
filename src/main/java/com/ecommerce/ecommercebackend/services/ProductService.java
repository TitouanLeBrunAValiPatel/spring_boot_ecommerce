package com.ecommerce.ecommercebackend.services;

import com.ecommerce.ecommercebackend.entities.Product;
import com.ecommerce.ecommercebackend.exceptions.ProductException;
import com.ecommerce.ecommercebackend.repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final IProductRepository iProductRepository;
    private final CategoryService categoryService;

    public ProductService(IProductRepository iProductRepository,CategoryService categoryService ){
        this.iProductRepository = iProductRepository;
        this.categoryService = categoryService;

    }

    public List<Product> getProducts(){

        return this.iProductRepository.findAll();
    }

/*
   TODO
    Créer une fonction qui permet de trouver 1 produit.
    nom de la fonction : getProduct()
    paramètre :  l'id du produit
    retour : Product

    Pour aider tu vas avoir besoin des class Optional et ProductException
    method utilisé pour la class optional : isPresent() return un bool
*/
}

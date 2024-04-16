package com.example.demo.controllers;

import com.example.demo.models.Categorie;
import com.example.demo.services.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategorieController {

    private CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping("/")
    public List<Categorie> categories (){
        return categorieService.list();
    }

    @PostMapping("/create")
    public Categorie create(@RequestBody Categorie categorie){
        return categorieService.create(categorie);
    }
}

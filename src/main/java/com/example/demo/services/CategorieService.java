package com.example.demo.services;

import com.example.demo.models.Categorie;
import com.example.demo.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    private CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public List<Categorie> list(){
        return categorieRepository.findAll();
    }

    public Categorie create(Categorie categorie){
        return categorieRepository.save(categorie);
    }

    public Categorie findById(Long id){
        return categorieRepository.findById(id).get();
    }
}

package com.example.tpachatproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tpachatproject.entities.CategorieProduit;
import com.example.tpachatproject.repositories.CategorieProduitRepository;

@Service
public class CategorieProduitServiceImpl implements ICategorieProduitService {


    @Autowired
    CategorieProduitRepository categorieProduitRepository;
    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {

        return categorieProduitRepository.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        categorieProduitRepository.save(cp);
        return cp;
    }

    @Override
    public void deleteCategorieProduit(Long id) {
        categorieProduitRepository.deleteById(id);

    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        categorieProduitRepository.save(cp);
        return cp;
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        CategorieProduit categorieProduit = categorieProduitRepository.findById(id).orElse(null);
        return categorieProduit;
    }

}
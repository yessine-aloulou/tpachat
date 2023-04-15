package com.example.tpachatproject.services;

import java.util.List;

import com.example.tpachatproject.entities.CategorieProduit;


public interface ICategorieProduitService {

    List<CategorieProduit> retrieveAllCategorieProduits();

    CategorieProduit addCategorieProduit(CategorieProduit cp);

    void deleteCategorieProduit(Long id);

    CategorieProduit updateCategorieProduit(CategorieProduit cp);

    CategorieProduit retrieveCategorieProduit(Long id);

}
package com.example.tpachatproject.services;

import java.util.List;
import com.example.tpachatproject.entities.Produit;

public interface IProduitService {

    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p);

    void deleteProduit(Long id);

    Produit updateProduit(Produit p);

    Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);

}
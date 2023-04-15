package com.example.tpachatproject.services;

import java.util.List;
import com.example.tpachatproject.entities.Fournisseur;

public interface IFournisseurService {

    List<Fournisseur> retrieveAllFournisseurs();

    Fournisseur addFournisseur(Fournisseur f);

    void deleteFournisseur(Long id);

    Fournisseur updateFournisseur(Fournisseur f);

    Fournisseur retrieveFournisseur(Long id);

    void assignSecteurActiviteToFournisseur(Long idSecteurActivite, Long idFournisseur);

}
package com.example.tpachatproject.services;

import java.util.List;
import com.example.tpachatproject.entities.Operateur;


public interface IOperateurService {

    List<Operateur> retrieveAllOperateurs();

    Operateur addOperateur(Operateur o);

    void deleteOperateur(Long id);

    Operateur updateOperateur(Operateur o);

    Operateur retrieveOperateur(Long id);

}
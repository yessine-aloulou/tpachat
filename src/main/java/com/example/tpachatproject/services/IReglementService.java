package com.example.tpachatproject.services;

import java.util.Date;
import java.util.List;

import com.example.tpachatproject.entities.Reglement;

public interface IReglementService {

    List<Reglement> retrieveAllReglements();
    Reglement addReglement(Reglement r);
    Reglement retrieveReglement(Long id);
    List<Reglement> retrieveReglementByFacture(Long idFacture);
    float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);

}
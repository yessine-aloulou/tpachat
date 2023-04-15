package com.example.tpachatproject.services;

import java.util.List;

import com.example.tpachatproject.entities.SecteurActivite;

public interface ISecteurActiviteService {

    List<SecteurActivite> retrieveAllSecteurActivite();

    SecteurActivite addSecteurActivite(SecteurActivite sa);

    void deleteSecteurActivite(Long id);

    SecteurActivite updateSecteurActivite(SecteurActivite sa);

    SecteurActivite retrieveSecteurActivite(Long id);

}
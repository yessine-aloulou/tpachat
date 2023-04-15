package com.example.tpachatproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tpachatproject.entities.SecteurActivite;
import com.example.tpachatproject.repositories.SecteurActiviteRepository;

@Service
public class SecteurActiviteServiceImpl implements ISecteurActiviteService{

    @Autowired
    SecteurActiviteRepository secteurActiviteRepository;
    @Override
    public List<SecteurActivite> retrieveAllSecteurActivite() {
        return (List<SecteurActivite>) secteurActiviteRepository.findAll();
    }

    @Override
    public SecteurActivite addSecteurActivite(SecteurActivite sa) {
        secteurActiviteRepository.save(sa);
        return sa;
    }

    @Override
    public void deleteSecteurActivite(Long id) {
        secteurActiviteRepository.deleteById(id);

    }

    @Override
    public SecteurActivite updateSecteurActivite(SecteurActivite sa) {
        secteurActiviteRepository.save(sa);
        return sa;
    }

    @Override
    public SecteurActivite retrieveSecteurActivite(Long id) {
        SecteurActivite secteurActivite = secteurActiviteRepository.findById(id).orElse(null);
        return secteurActivite;
    }

}
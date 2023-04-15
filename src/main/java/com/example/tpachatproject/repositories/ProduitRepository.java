package com.example.tpachatproject.repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.tpachatproject.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
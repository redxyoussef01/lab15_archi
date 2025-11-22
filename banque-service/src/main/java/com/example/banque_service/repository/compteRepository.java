package com.example.banque_service.repository;

import com.example.banque_service.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface compteRepository extends JpaRepository<Compte, Long> {

    /**
     * Calculates the sum of the 'solde' field for all Compte entities.
     * The @Query annotation is mandatory for custom aggregation functions.
     */
    @Query("SELECT SUM(c.solde) FROM Compte c")
    double sumSoldes();
}
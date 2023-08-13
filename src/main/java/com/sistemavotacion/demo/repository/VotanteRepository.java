package com.sistemavotacion.demo.repository;

import com.sistemavotacion.demo.model.Votante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VotanteRepository extends JpaRepository<Votante, Long> {
}

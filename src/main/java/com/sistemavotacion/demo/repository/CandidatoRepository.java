package com.sistemavotacion.demo.repository;

import com.sistemavotacion.demo.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {


}

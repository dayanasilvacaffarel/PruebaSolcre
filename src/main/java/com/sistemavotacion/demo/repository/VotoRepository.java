package com.sistemavotacion.demo.repository;

import com.sistemavotacion.demo.model.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends JpaRepository <Voto, Long> {
}

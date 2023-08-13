package com.sistemavotacion.demo.service;

import com.sistemavotacion.demo.model.Candidato;
import com.sistemavotacion.demo.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public void guardar(Candidato candidato){
        candidatoRepository.save(candidato);
    }

    public List<Candidato> listarTodos(){
        return candidatoRepository.findAll();
    }

}

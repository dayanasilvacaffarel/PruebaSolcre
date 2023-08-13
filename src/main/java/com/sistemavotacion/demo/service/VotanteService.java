package com.sistemavotacion.demo.service;

import com.sistemavotacion.demo.model.Votante;
import com.sistemavotacion.demo.repository.VotanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotanteService {

    @Autowired
    private VotanteRepository votanteRepository;
    public void guardar(Votante votante){
        votanteRepository.save(votante);
    }
    public List<Votante> listarTodos(){
        return votanteRepository.findAll();
    }

}

package com.sistemavotacion.demo.service;

import com.sistemavotacion.demo.model.Voto;
import com.sistemavotacion.demo.repository.VotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VotoService {

    private VotoRepository votoRepository;

    public void guardar(Voto voto) {
        votoRepository.save(voto);
    }

    public List<Voto> listarTodos(){
        return votoRepository.findAll();
    }

}
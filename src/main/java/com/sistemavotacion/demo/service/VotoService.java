package com.sistemavotacion.demo.service;

import com.sistemavotacion.demo.model.Candidato;
import com.sistemavotacion.demo.model.Votante;
import com.sistemavotacion.demo.model.Voto;
import com.sistemavotacion.demo.repository.CandidatoRepository;
import com.sistemavotacion.demo.repository.VotanteRepository;
import com.sistemavotacion.demo.repository.VotoRepository;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class VotoService {

    private VotoRepository votoRepository;
    private VotanteRepository votanteRepository;
    private CandidatoRepository candidatoRepository;

    public void registrarVoto (Long id){
        Votante votante = votanteRepository.findById(id).orElse(null);
        Candidato candidato = candidatoRepository.findById(id).orElse(null);

        if(votante==null||candidato==null){
            return;
        }
        Voto voto = new Voto();
        voto.setVotante(votante);
        voto.setCandidato(candidato);
        voto.setFecha(LocalDate.now());
        votoRepository.save(voto);

    }
    public void guardar(Voto voto) {
        votoRepository.save(voto);
    }

    public List<Voto> listarTodos(){
        return votoRepository.findAll();
    }

}
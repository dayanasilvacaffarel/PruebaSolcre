package com.sistemavotacion.demo.controller;

import com.sistemavotacion.demo.model.Candidato;
import com.sistemavotacion.demo.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @GetMapping("/candidatos")
    public List<Candidato> obtenerCandidatos(){
        List<Candidato> listaCandidatos = new ArrayList<>();

        Candidato c1 = new Candidato();
        c1.setNombre("Michael");
        c1.setApellido("Scott");
        c1.setDocumento("1111");

        Candidato c2 = new Candidato();
        c2.setNombre("Dwight");
        c2.setApellido("Schrute");
        c2.setDocumento("2222");

        listaCandidatos.add(c1);
        listaCandidatos.add(c2);

        return listaCandidatos;
    }

    @PostMapping("/candidato")
    public Candidato guardarCandidato (@RequestBody Candidato candidato){
        System.out.println(candidato);
        candidatoService.guardar(candidato);
        return candidato;
    }

    @GetMapping("/candidato")
    public List<Candidato> listarCandidatos(){
        return candidatoService.listarTodos();
    }

}

package com.sistemavotacion.demo.controller;

import com.sistemavotacion.demo.model.Votante;
import com.sistemavotacion.demo.service.VotanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VotanteController {

    @Autowired
    private VotanteService votanteService;

    @GetMapping("/votantes")
    public List<Votante> obtenerVotantes(){
        List<Votante> listaVotantes = new ArrayList<>();

        Votante v1 = new Votante();
        v1.setNombre("Jim");
        v1.setApellido("Harpert");
        v1.setDocumento("3333");

        Votante v2 = new Votante();
        v2.setNombre("Creed");
        v2.setApellido("Braton");
        v2.setDocumento("4444");

        Votante v3 = new Votante();
        v3.setNombre("Pam");
        v3.setApellido("Beesley");
        v3.setDocumento("5555");

        Votante v4 = new Votante();
        v4.setNombre("Toby");
        v4.setApellido("Flenderson");
        v4.setDocumento("6666");

        Votante v5 = new Votante();
        v5.setNombre("Phyllis");
        v5.setApellido("Vance");
        v5.setDocumento("7777");

        Votante v6 = new Votante();
        v6.setNombre("Kevin");
        v6.setApellido("Malone");
        v6.setDocumento("8888");

        Votante v7 = new Votante();
        v7.setNombre("Angela");
        v7.setApellido("Martin");
        v7.setDocumento("9999");

        listaVotantes.add(v1);
        listaVotantes.add(v2);
        listaVotantes.add(v3);
        listaVotantes.add(v4);
        listaVotantes.add(v5);
        listaVotantes.add(v6);
        listaVotantes.add(v7);


        return listaVotantes;
    }

    @PostMapping("/votante")
    public Votante guardarVotante(@RequestBody Votante votante){
        votanteService.guardar(votante);
        return votante;
    }
    @GetMapping("/votante")
    public List<Votante> listarVotantes(){
        return votanteService.listarTodos();
    }

}

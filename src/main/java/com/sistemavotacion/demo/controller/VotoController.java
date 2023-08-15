package com.sistemavotacion.demo.controller;

import com.sistemavotacion.demo.model.Voto;
import com.sistemavotacion.demo.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/voto")
public class VotoController {

    @Autowired
    private VotoService votoService;

    @GetMapping("/votos")
    public List<Voto> obtenerVotos(){
        List<Voto> listaVotos = new ArrayList<>();
        return listaVotos;
    }

    @PostMapping("/voto")
    public Voto guardarVoto (Voto voto){
        votoService.guardar(voto);
        return voto;
    }

    @GetMapping("/voto")
    public List<Voto> listarVotos(){
        return votoService.listarTodos();
    }
}

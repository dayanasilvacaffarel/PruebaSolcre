package com.sistemavotacion.demo.controller;

import com.sistemavotacion.demo.model.Candidato;
import com.sistemavotacion.demo.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @PostMapping
    public ResponseEntity<Candidato> guardarCandidato (@RequestBody Candidato candidato){
        return ResponseEntity.ok(candidato);
    }
    @GetMapping
    public ResponseEntity<List<Candidato>> listarCandidatos(){
        return ResponseEntity.ok(candidatoService.listarTodos());
    }

}

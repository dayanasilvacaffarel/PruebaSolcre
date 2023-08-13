package com.sistemavotacion.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "voto")
public class Voto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "candidato_id", referencedColumnName = "id")
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name = "votante_id", referencedColumnName = "id")
    private Votante votante;
}

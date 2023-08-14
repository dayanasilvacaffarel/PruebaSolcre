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

    public Voto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Votante getVotante() {
        return votante;
    }

    public void setVotante(Votante votante) {
        this.votante = votante;
    }
}

package com.darkcode.app.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "TBL_programas")
public class ProgramaRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "NombreP")
    private String nombreP;

    @Column(name = "Nivel")
    private String nivel;

    @Column(name = "Creditos")
    private String creditos;

    @Column(name = "EstadoP")
    private boolean estadoP;
}
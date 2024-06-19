package com.darkcode.app.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "TBL_tutoriales")
public class TutorialRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Url")
    private String url;

    @Column(name = "Estado")
    private String estado;

    @Column(name= "Fecha")
    private String fecha;

    @Column(name = "Autor")
    private String autor;
    
}

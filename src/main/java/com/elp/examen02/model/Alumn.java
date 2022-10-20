package com.elp.examen02.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Alumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno")
    private Integer idalumno;
    private String nombre;
    private String dni;
    private String ciclo;
    private String f_nac;
    private String direccion;
    private String telefono;
}

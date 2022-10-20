package com.elp.examen02.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Alumno {

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

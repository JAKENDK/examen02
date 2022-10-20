package com.elp.examen02.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pensin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpension")
    private Integer idpension;
    private String monto;
    private String fecha;
    private Integer idAlumno;

}

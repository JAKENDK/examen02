package com.elp.examen02.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pension {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpension")
    private Integer idpension;
    private String monto;
    private String fecha;


}

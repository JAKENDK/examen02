package com.elp.examen02.controller;

import com.elp.examen02.model.Alumno;
import com.elp.examen02.repository.AlumnRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/admin/alumno")
public class AlumnoController {
    private  final AlumnRepository alumnRepository;

    public AlumnoController(AlumnRepository alumnRepository){

        this.alumnRepository=alumnRepository;
    }

    @GetMapping("")
    Page<Alumno> index(@PageableDefault(sort = "dni" ,size = 5) Pageable pageable){
        return alumnRepository.findAll(pageable);
    }

    @GetMapping("/{idAlumno}")
    Alumno obtener(@PathVariable Integer idAlumno){
        return alumnRepository.findById(idAlumno).orElseThrow(EntityNotFoundException::new);
    }
}

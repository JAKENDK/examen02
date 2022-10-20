package com.elp.examen02.controller;

import com.elp.examen02.model.Alumno;
import com.elp.examen02.model.Pension;
import com.elp.examen02.repository.PensionRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/admin/pension")
public class PensionController {
    private  final PensionRepository pensionRepository;

    public PensionController(PensionRepository pensionRepository){

        this.pensionRepository=pensionRepository;
    }

    @GetMapping("")
    Page<Pension> index(@PageableDefault(size = 5) Pageable pageable){
        return pensionRepository.findAll(pageable);
    }

    @GetMapping("/{idpension}")
    Pension obtener(@PathVariable Integer idpension){
        return pensionRepository.findById(idpension).orElseThrow(EntityNotFoundException::new);
    }
}

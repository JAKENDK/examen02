package com.elp.examen02.controller;

import com.elp.examen02.model.Alumn;
import com.elp.examen02.repository.AlumnRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/matricula")
public class MatricuController {
    private  final AlumnRepository alumnRepository;

    public MatricuController(AlumnRepository alumnRepository){

        this.alumnRepository=alumnRepository;
    }

    @GetMapping("")
    Page<Alumn> index(@PageableDefault(sort = "dni" ,size = 5) Pageable pageable){
        return alumnRepository.findAll(pageable);
    }
}

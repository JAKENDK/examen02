package com.elp.examen02.repository;

import com.elp.examen02.model.Alumn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlumnRepository extends JpaRepository<Alumn,Integer> {

    List<Alumn> findTop6ByOrderBy();
    Optional<Alumn> findByIdandDni(Integer id, String dni);

}

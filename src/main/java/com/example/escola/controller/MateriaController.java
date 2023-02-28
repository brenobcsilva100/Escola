package com.example.escola.controller;

import com.example.escola.persistence.model.Materia;
import com.example.escola.service.AlunoService;
import com.example.escola.service.MateriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MateriaController {

    private final MateriaService materiaService;

    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping("/mostrarMateria")
    private ResponseEntity<?> mostrarMateria(){
        return new ResponseEntity<>(materiaService.mostrar(), HttpStatus.OK);
    }

    @PostMapping("/salvarMateria")
    public ResponseEntity<Materia> salvarProfessor(@RequestBody Materia materia){
        return new ResponseEntity<>(materiaService.salvar(materia), HttpStatus.CREATED);
    }

}

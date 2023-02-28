package com.example.escola.controller;

import com.example.escola.persistence.model.Materia;
import com.example.escola.persistence.model.Professor;
import com.example.escola.service.MateriaService;
import com.example.escola.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/mostrarProfessor")
    private ResponseEntity<?> mostrarProfessor(){
        return new ResponseEntity<>(professorService.mostrar(), HttpStatus.OK);
    }

    @PostMapping("/salvarProfessor")
    public ResponseEntity<Professor> salvarProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorService.salvar(professor), HttpStatus.CREATED);
    }

}

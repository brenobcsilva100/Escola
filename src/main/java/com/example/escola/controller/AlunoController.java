package com.example.escola.controller;

import com.example.escola.persistence.model.Aluno;
import com.example.escola.persistence.model.Professor;
import com.example.escola.service.AlunoService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/mostrarAluno")
    private ResponseEntity<?> mostrarAluno(){
        return new ResponseEntity<>(alunoService.mostrar(), HttpStatus.OK);
    }

    @PostMapping("/salvarAluno")
    public ResponseEntity<Aluno> salvarAluno(@RequestBody Aluno aluno) throws Exception {
        return new ResponseEntity<>(alunoService.salvar(aluno), HttpStatus.CREATED);
    }


}

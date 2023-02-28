package com.example.escola.service;

import com.example.escola.persistence.model.Materia;
import com.example.escola.persistence.model.Professor;
import com.example.escola.persistence.repository.MateriaRepository;
import com.example.escola.persistence.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<?> mostrar(){
        return professorRepository.findAll();
    }

    public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }
}

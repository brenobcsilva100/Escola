package com.example.escola.service;

import com.example.escola.persistence.model.Materia;
import com.example.escola.persistence.repository.MateriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {

    private final MateriaRepository materiaRepository;

    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    public List<?> mostrar(){
        return materiaRepository.findAll();
    }

    public Materia salvar(Materia materia){
        return materiaRepository.save(materia);
    }


}

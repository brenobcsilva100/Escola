package com.example.escola.service;

import com.example.escola.persistence.model.Aluno;
import com.example.escola.persistence.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private Aluno aluno = new Aluno();

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<?> mostrar(){
        return alunoRepository.findAll();
    }

    public Aluno salvar(Aluno aluno) throws Exception {
        if(aluno.getNome().equals("")){
            throw new Exception("Vazio");
        }
        return alunoRepository.save(aluno);
    }





}

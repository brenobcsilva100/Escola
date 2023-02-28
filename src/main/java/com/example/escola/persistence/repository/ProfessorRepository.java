package com.example.escola.persistence.repository;

import com.example.escola.persistence.model.Aluno;
import com.example.escola.persistence.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{


}

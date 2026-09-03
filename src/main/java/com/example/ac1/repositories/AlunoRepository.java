package com.example.ac1.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ac1.models.Aluno;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

public class AlunoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Aluno inserir(Aluno aluno){
        return entityManager.merge(aluno);
    }

    @Transactional
    public void excluir(Aluno aluno){
        entityManager.remove(aluno);
    }

    @Transactional Aluno editar(Aluno aluno){
        return entityManager.merge(aluno);
    }

    public List<Aluno> getAll(){
        return entityManager.createQuery("from tbl_alunos", Aluno.class).getResultList();
    }

    public Aluno getById(Long id){
        return entityManager.find(Aluno.class, id);
    }
}

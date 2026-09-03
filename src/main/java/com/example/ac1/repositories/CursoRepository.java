package com.example.ac1.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ac1.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CursoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Curso inserir(Curso curso){
        return entityManager.merge(curso);
    }

    @Transactional
    public void excluir(Curso curso){
        entityManager.remove(curso);
    }

    @Transactional Curso editar(Curso curso){
        return entityManager.merge(curso);
    }

    public List<Curso> getAll(){
        return entityManager.createQuery("from tbl_cursos", Curso.class).getResultList();
    }

    public Curso getById(Long id){
        return entityManager.find(Curso.class, id);
    }
}

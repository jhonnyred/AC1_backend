package com.example.filmes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.filmes.models.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{
    
    public List<Filme> findByDuracaoGreaterThan(int duracao);

    public List<Filme> findByDuracaoLessOrEquals(int duracao);

    public List<Filme> findByTituloLike(String titulo);
}

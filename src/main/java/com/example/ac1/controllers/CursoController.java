package com.example.ac1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.models.Curso;
import com.example.ac1.repositories.CursoRepository;



@RestController
public class CursoController {
    @Autowired
    CursoRepository cursorp;

    @PostMapping("/adicionar-curso")
    public Curso add(@RequestBody Curso curso){
        return cursorp.inserir(curso);
    }
    
    @GetMapping("/mostrar-todos")
    public List<Curso> showAll(){
        List<Curso> listaCursos = cursorp.getAll();
        return listaCursos;
    }
}

package com.example.ac1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 1000)
    private String name;
    private int anoIngresso;
    @ManyToOne
    private int idCurso;
    
    Aluno(){}
    
    Aluno(String name, int anoIngresso){
        this.name = name;
        this.anoIngresso = anoIngresso;
    }
    
    @Override
    public String toString() {
        return "Aluno [name=" + name + ", anoIngresso=" + anoIngresso + ", idCurso=" + idCurso + "]";
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAnoIngresso() {
        return anoIngresso;
    }
    
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
    public int getIdCurso() {
        return idCurso;
    }
    
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
    
}

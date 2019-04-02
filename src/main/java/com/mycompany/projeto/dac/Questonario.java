/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.dac;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author 
 */
@Entity
public class Questonario implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Professor professor;
    @OneToMany
    private List<Questao> questoes;
    @Convert(converter = ConvertLocalDate.class)
    private LocalDate datainicio;
    @Convert(converter = ConvertLocalDate.class)
    private LocalDate datafim;

    public Questonario() {
    }

    public Questonario(Professor professor, List<Questao> questoes, LocalDate datainicio, LocalDate datafim) {
        this.professor = professor;
        this.questoes = questoes;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public LocalDate getDatafim() {
        return datafim;
    }

    public void setDatafim(LocalDate datafim) {
        this.datafim = datafim;
    }
    
}

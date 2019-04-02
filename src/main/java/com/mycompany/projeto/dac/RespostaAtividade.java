/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.dac;

import java.io.Serializable;
import java.util.List;
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
public class RespostaAtividade implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    private List<Resposta> respostas;
    @OneToOne
    private Aluno aluno;
    @OneToOne
    private Atividade atividade;

    public RespostaAtividade() {
    }

    public RespostaAtividade(List<Resposta> respostas, Aluno aluno, Atividade atividade) {
        this.respostas = respostas;
        this.aluno = aluno;
        this.atividade = atividade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
   
}
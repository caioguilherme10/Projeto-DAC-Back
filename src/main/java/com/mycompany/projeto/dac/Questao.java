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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author 
 */
@Entity
public class Questao implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String descricao;
    @OneToMany
    //@JoinColumn(name = "alternativa_id")
    private List<Alternativa> alternativas;
    private String[] alternativacerta;
    private boolean questonario;
    private boolean atividade;

    public Questao() {
    }

    public Questao(String descricao, List<Alternativa> alternativas, String[] alternativacerta, boolean questonario, boolean atividade) {
        this.descricao = descricao;
        this.alternativas = alternativas;
        this.alternativacerta = alternativacerta;
        this.questonario = questonario;
        this.atividade = atividade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }

    public String[] getAlternativacerta() {
        return alternativacerta;
    }

    public void setAlternativacerta(String[] alternativacerta) {
        this.alternativacerta = alternativacerta;
    }

    public boolean isQuestonario() {
        return questonario;
    }

    public void setQuestonario(boolean questonario) {
        this.questonario = questonario;
    }

    public boolean isAtividade() {
        return atividade;
    }

    public void setAtividade(boolean atividade) {
        this.atividade = atividade;
    }
    
    
}

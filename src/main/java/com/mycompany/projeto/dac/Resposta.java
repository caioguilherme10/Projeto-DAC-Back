/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.dac;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author 
 */
@Entity
public class Resposta implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String[] resposta;
    @OneToOne
    private Questao questao;

    public Resposta() {
    }

    public Resposta(String[] resposta, Questao questao) {
        this.resposta = resposta;
        this.questao = questao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getResposta() {
        return resposta;
    }

    public void setResposta(String[] resposta) {
        this.resposta = resposta;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }
   
}
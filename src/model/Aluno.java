/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import padraostate.AlunoEstado;
import padraostate.AlunoEstadoMatriculado;

/**
 *
 * @author Leoginski
 */
public class Aluno {

    private int id;
    private String nome;
    private AlunoEstado estado;

    public Aluno(String nome) {
        this.nome = nome;
        this.estado = new AlunoEstadoMatriculado();
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public void matricular() {
        estado.matricular(this);
    }

    public void trancar() {
        estado.trancar(this);
    }

    public void formar() {
        estado.formar(this);
    }

    public void suspender() {
        estado.suspender(this);
    }

    public void evadir() {
        estado.evadir(this);
    }

    public void jubilar() {
        estado.jubilar(this);
    }
}

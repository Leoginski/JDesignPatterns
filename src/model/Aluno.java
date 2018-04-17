/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import padraostate.AlunoEstado;
import padraostate.AlunoEstadoEvadido;
import padraostate.AlunoEstadoFormado;
import padraostate.AlunoEstadoJubilado;
import padraostate.AlunoEstadoMatriculado;
import padraostate.AlunoEstadoSuspenso;
import padraostate.AlunoEstadoTrancado;

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
        estado.matricular();
        this.estado = new AlunoEstadoMatriculado();
    }

    public void trancar() {
        estado.trancar();
        this.estado = new AlunoEstadoTrancado();
    }

    public void formar() {
        estado.formar();
        this.estado = new AlunoEstadoFormado();
    }

    public void suspender() {
        estado.suspender();
        this.estado = new AlunoEstadoSuspenso();
    }

    public void evadir() {
        estado.evadir();
        this.estado = new AlunoEstadoEvadido();
    }

    public void jubilar() {
        estado.jubilar();
        this.estado = new AlunoEstadoJubilado();
    }
}
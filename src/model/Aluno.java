/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enumerable.EstadoAluno;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public EstadoAluno matricular() {
        return estado.matricular();
    }

    public EstadoAluno trancar() {
        return estado.trancar();
    }

    public EstadoAluno formar() {
        return estado.formar();
    }

    public EstadoAluno suspender() {
        return estado.suspender();
    }

    public EstadoAluno evadir() {
        return estado.evadir();
    }

    public EstadoAluno jubilar() {
        return estado.jubilar();
    }
}

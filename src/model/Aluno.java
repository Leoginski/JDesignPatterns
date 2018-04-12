/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enumerable.EstadoAluno;

/**
 *
 * @author Leoginski
 */
public class Aluno {

    private int id;
    private String nome;
    private EstadoAluno estado;

    public Aluno(String nome) {
        this.nome = nome;
        this.estado = EstadoAluno.MATRICULADO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoAluno getEstado() {
        return estado;
    }

    public void setEstado(EstadoAluno estado) {
        this.estado = estado;
    }    

    public void matricular() {
        if (this.estado == EstadoAluno.SUSPENSO || this.estado == EstadoAluno.TRANCADO) {
            this.setEstado(EstadoAluno.MATRICULADO);
        }
    }

    public void trancar() {

    }

    public void formar() {

    }

    public void suspender() {

    }

    public void evadir() {

    }

    public void jubilar() {

    }
}

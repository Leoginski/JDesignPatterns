/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

import enumerable.EstadoAluno;

/**
 *
 * @author Leoginski
 */
public class AlunoEstadoMatriculado implements AlunoEstado {

    @Override
    public EstadoAluno getEstado() {
        return EstadoAluno.MATRICULADO;
    }

    @Override
    public EstadoAluno matricular() {
        System.out.println("O ALUNO JÁ ESTA MATRICULADO");
        return null;
    }

    @Override
    public EstadoAluno evadir() {
        System.out.println("O ALUNO EVADIDO");
        return EstadoAluno.EVADIDO;
    }

    @Override
    public EstadoAluno formar() {
        System.out.println("O ALUNO FORMOU");
        return EstadoAluno.EVADIDO;
    }

    @Override
    public EstadoAluno jubilar() {
        System.out.println("O ALUNO JUBILOU");
        return EstadoAluno.JUBILADO;
    }

    @Override
    public EstadoAluno suspender() {
        System.out.println("O ALUNO FOI SUSPENSO");
        return EstadoAluno.SUSPENSO;
    }

    @Override
    public EstadoAluno trancar() {
        System.out.println("O ALUNO TRANCOU");
        return EstadoAluno.TRANCADO;
    }

}

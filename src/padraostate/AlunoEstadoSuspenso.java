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
public class AlunoEstadoSuspenso implements AlunoEstado {

    @Override
    public EstadoAluno getEstado() {
        return EstadoAluno.SUSPENSO;
    }

    @Override
    public EstadoAluno matricular() {
        System.out.println("O ALUNO FOI MATRICULADO");
        return EstadoAluno.MATRICULADO;
    }

    @Override
    public EstadoAluno evadir() {
        System.out.println("O ALUNO NÃO FOI EVADIDO");
        return null;
    }

    @Override
    public EstadoAluno formar() {
        System.out.println("O ALUNO NÃO FORMOU");
        return null;
    }

    @Override
    public EstadoAluno jubilar() {
        System.out.println("O ALUNO NÃO FOI JUBILADO");
        return null;
    }

    @Override
    public EstadoAluno suspender() {
        System.out.println("O ALUNO JÁ ESTA SUSPENSO");
        return null;
    }

    @Override
    public EstadoAluno trancar() {
        System.out.println("O ALUNO NÃO TRANCOU");
        return null;
    }
}

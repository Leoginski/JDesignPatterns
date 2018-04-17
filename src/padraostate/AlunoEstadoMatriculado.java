/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

import enumerable.EstadoAluno;
import model.Aluno;

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
    public void matricular(Aluno aluno) {
        System.out.println("O ALUNO JÁ ESTA MATRICULADO");
    }

    @Override
    public void evadir(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoEvadido());
        System.out.println("O ALUNO EVADIDO");
    }

    @Override
    public void formar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoFormado());
        System.out.println("O ALUNO FORMOU");
    }

    @Override
    public void jubilar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoJubilado());
        System.out.println("O ALUNO JUBILOU");
    }

    @Override
    public void suspender(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoSuspenso());
        System.out.println("O ALUNO FOI SUSPENSO");
    }

    @Override
    public void trancar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoTrancado());
        System.out.println("O ALUNO TRANCOU");
    }

}

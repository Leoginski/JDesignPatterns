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
public interface AlunoEstado {
    
    public EstadoAluno getEstado();
    public void matricular(Aluno aluno);
    public void evadir(Aluno aluno);
    public void formar(Aluno aluno);
    public void jubilar(Aluno aluno);
    public void suspender(Aluno aluno);
    public void trancar(Aluno aluno);
   
}

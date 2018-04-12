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
public interface AlunoEstado {
    
    public EstadoAluno getEstado();
    public EstadoAluno matricular();
    public EstadoAluno evadir();
    public EstadoAluno formar();
    public EstadoAluno jubilar();
    public EstadoAluno suspender();
    public EstadoAluno trancar();
   
}

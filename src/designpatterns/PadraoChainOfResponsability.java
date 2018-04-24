/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import chainofresponsability.Documento;
import chainofresponsability.FuncionarioCoordenador;
import chainofresponsability.FuncionarioDiretor;
import chainofresponsability.FuncionarioReitor;
import chainofresponsability.FuncionarioSecretaria;
import chainofresponsability.RolDocumentos;

/**
 *
 * @author Leoginski
 */
public class PadraoChainOfResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FuncionarioReitor reitor = new FuncionarioReitor(null);
        FuncionarioDiretor diretor = new FuncionarioDiretor(reitor);
        FuncionarioCoordenador coordenador = new FuncionarioCoordenador(diretor);
        FuncionarioSecretaria secretaria = new FuncionarioSecretaria(coordenador);

        System.out.println(secretaria.assinarDocumento(new Documento(RolDocumentos.getInstance().getTipoDocumentoHistorico())));
        System.out.println(secretaria.assinarDocumento(new Documento(RolDocumentos.getInstance().getTipoDocumentoMatricula())));
        System.out.println(secretaria.assinarDocumento(new Documento(RolDocumentos.getInstance().getTipoDocumentoCertificado())));
        System.out.println(secretaria.assinarDocumento(new Documento(RolDocumentos.getInstance().getTipoDocumentoDiploma())));
        System.out.println(secretaria.assinarDocumento(new Documento(RolDocumentos.getInstance().getTipoDocumentoBoleto())));
    }
}

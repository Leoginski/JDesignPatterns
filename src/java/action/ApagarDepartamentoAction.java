/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Departamento;
import persistence.DepartamentoDAO;

/**
 *
 * @author Aluno
 */
public class ApagarDepartamentoAction implements Action {

    public ApagarDepartamentoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String id = request.getParameter("textId");

        if (id.equals("")) {
            response.sendRedirect("Departamento/apagar.jsp");
        } else {

            Departamento departamento = new Departamento(Integer.parseInt(id));

            try {
                DepartamentoDAO.getInstance().delete(departamento);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp?erro=" + ex);
                ex.printStackTrace();
            }
        }
    }

}

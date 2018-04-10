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
 * @author DualLayer
 */
public class EditarDepartamentoAction implements Action {

    public EditarDepartamentoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String id = request.getParameter("textId");
        String nome = request.getParameter("textNome");

        Departamento departamentoResponse = new Departamento();

        if (id.equals("") || nome.equals("")) {
            response.sendRedirect("Departamento/editar.jsp");
        } else {
            Departamento departamento = new Departamento(Integer.parseInt(id), nome);
            try {
                DepartamentoDAO.getInstance().editar(departamento);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp?erro=" + ex);
                ex.printStackTrace();
            }
        }

    }

}
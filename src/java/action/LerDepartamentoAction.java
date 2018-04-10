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
public class LerDepartamentoAction implements Action {

    public LerDepartamentoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String id = request.getParameter("textId");
        Departamento departamentoResponse = new Departamento();

        if (id.equals("")) {
            response.sendRedirect("lerDepartamento.jsp");
        } else {
            Departamento departamento = new Departamento(Integer.parseInt(id));
            try {
                departamentoResponse = DepartamentoDAO.getInstance().get(departamento);
                response.sendRedirect("Departamento/ler.jsp?id=" + departamentoResponse.getId() + "&nome=" + departamentoResponse.getNome());
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp?erro=" + ex);
                ex.printStackTrace();
            }
        }

    }

}

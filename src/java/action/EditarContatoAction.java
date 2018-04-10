package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;
import persistence.ContatoDAO;

/**
 *
 * @author DualLayer
 */
public class EditarContatoAction implements Action {

    public EditarContatoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String id = request.getParameter("textId");
        String nome = request.getParameter("textNome");
        String email = request.getParameter("textEmail");

        Contato ContatoResponse = new Contato();

        if (id.equals("") || nome.equals("") || email.equals("")) {
            response.sendRedirect("Contato/editar.jsp");
        } else {
            Contato Contato = new Contato(Integer.parseInt(id), nome, email);
            try {
                ContatoDAO.getInstance().editar(Contato);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp?erro=" + ex);
                ex.printStackTrace();
            }
        }

    }

}

package persistence;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Contato;

public class ContatoDAO {

    private static ContatoDAO instance = new ContatoDAO();

    public static ContatoDAO getInstance() {
        return instance;
    }

    private ContatoDAO() {
    }

    public void save(Contato Contato) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("INSERT INTO Contato (nome, email) "
                    + "VALUES ('" + Contato.getNome() + "', '" + Contato.getEmail() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void delete(Contato Contato) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("DELETE FROM Contato WHERE id = " + Contato.getId());
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public Contato get(Contato Contato) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Contato ContatoResult = new Contato();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Contato AS c WHERE c.id = " + Contato.getId());
            while (rs.next()) {
                ContatoResult.setId(rs.getInt("c.id"));
                ContatoResult.setNome(rs.getString("c.nome"));
                ContatoResult.setEmail(rs.getString("c.email"));
            }

            return ContatoResult;
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void editar(Contato Contato) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            st.execute(
                    "UPDATE Contato AS c"
                    + " SET nome = '" + Contato.getNome() + "', email = '" + Contato.getEmail() + "'"
                    + " WHERE c.id = " + Contato.getId());

        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void closeResourcer(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
        }
    }

}

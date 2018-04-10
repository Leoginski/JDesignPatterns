package persistence;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Departamento;

public class DepartamentoDAO {

    private static DepartamentoDAO instance = new DepartamentoDAO();

    public static DepartamentoDAO getInstance() {
        return instance;
    }

    private DepartamentoDAO() {
    }

    public void save(Departamento departamento) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("INSERT INTO DEPARTAMENTO (nome) "
                    + "VALUES ('" + departamento.getNome() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void delete(Departamento departamento) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("DELETE FROM DEPARTAMENTO WHERE id = " + departamento.getId());
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public Departamento get(Departamento departamento) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Departamento departamentoResult = new Departamento();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM DEPARTAMENTO AS c WHERE c.id = " + departamento.getId());
            while (rs.next()) {
                departamentoResult.setId(rs.getInt("c.id"));
                departamentoResult.setNome(rs.getString("c.nome"));
            }

            return departamentoResult;
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void editar(Departamento departamento) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            st.execute(
                    "UPDATE DEPARTAMENTO AS c"
                    + " SET nome = '" + departamento.getNome() + "' WHERE c.id = " + departamento.getId());

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
package persistencia;

import java.sql.*;
import modelo.Usuario;

public class UsuarioDAO {

    public Usuario login(String user, String pass) {

        Usuario u = null;

        try (Connection con = Conexion.getConnection()) {

            String sql = "SELECT * FROM usuario WHERE usuario=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                u = new Usuario(
                        rs.getInt("id"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getString("rol")
                );
            }

        } catch (Exception e) {
            System.out.println("Error login: " + e.getMessage());
        }

        return u;
    }
}
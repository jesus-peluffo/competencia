package servicio;

import modelo.Usuario;
import persistencia.UsuarioDAO;

public class LoginService {

    private UsuarioDAO dao = new UsuarioDAO();

    public Usuario login(String user, String pass) {
        return dao.login(user, pass);
    }
}
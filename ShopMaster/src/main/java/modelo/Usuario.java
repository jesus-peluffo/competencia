package modelo;

public class Usuario {

    private int id;
    private String usuario;
    private String password;
    private String rol;

    // ✔ constructor vacío (OBLIGATORIO PARA MYSQL)
    public Usuario() {
    }

    // ✔ constructor completo (MYSQL)
    public Usuario(int id, String usuario, String password, String rol) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }

    // ✔ NUEVO: constructor de 3 parámetros (ESTO TE FALTABA)
    public Usuario(String usuario, String password, String rol) {
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }

    // GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
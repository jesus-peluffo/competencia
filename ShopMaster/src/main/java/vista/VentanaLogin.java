package vista;

import java.util.Scanner;
import modelo.Usuario;
import servicio.LoginService;
import servicio.TiendaService;

public class VentanaLogin {

    private LoginService loginService = new LoginService();
    private TiendaService tienda = new TiendaService();

    public void iniciar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LOGIN SHOPMASTER =====");

        System.out.print("Usuario: ");
        String user = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        // ✔ AQUÍ ESTÁ LA CORRECCIÓN REAL
        Usuario usuario = loginService.login(user, pass);

        if (usuario != null) {

            System.out.println("\nBienvenido: " + usuario.getUsuario());
            System.out.println("Rol: " + usuario.getRol());

            menuPrincipal(sc, usuario);

        } else {
            System.out.println("❌ Usuario o contraseña incorrectos");
        }
    }

    private void menuPrincipal(Scanner sc, Usuario usuario) {

        int op;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Ver productos");
            System.out.println("2. Filtrar por categoría");
            System.out.println("3. Salir");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    tienda.listar();
                    break;

                case 2:
                    System.out.print("Categoría: ");
                    String cat = sc.nextLine();
                    tienda.filtrarCategoria(cat);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (op != 3);
    }
}
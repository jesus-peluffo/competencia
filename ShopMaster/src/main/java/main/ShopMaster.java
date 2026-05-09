package com.mycompany.shopmaster;

import java.util.Scanner;

public class ShopMaster {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=================================");
            System.out.println("      SHOPMASTER - MENU");
            System.out.println("=================================");
            System.out.println("1. Login");
            System.out.println("2. Ver productos");
            System.out.println("3. Carrito");
            System.out.println("4. Salir");
            System.out.print("Seleccione opción: ");

            opcion = sc.nextInt();

            // SWITCH COMPATIBLE (NO FALLA EN NINGUNA VERSION)
            switch (opcion) {

                case 1:
                    System.out.println("-> LOGIN EN PROCESO...");
                    // aquí luego conectas LoginService
                    break;

                case 2:
                    System.out.println("-> LISTA DE PRODUCTOS");

                    // simulación simple (luego lo conectas a ProductoDAO)
                    System.out.println("RTX 4080 - $3200");
                    System.out.println("Ryzen 7 7800X3D - $1600");
                    System.out.println("32GB RAM - $450");

                    break;

                case 3:
                    System.out.println("-> CARRITO VACÍO (por ahora)");
                    // luego conectamos sesión web
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}
package banconfila;

// Ejercicio 6
import java.util.Scanner;

public class Principal {

    // Limpiar la consola
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Pausar el programa
    public static void pause() {
        System.out.print("Presiona Enter para continuar");
        Scanner pause = new Scanner(System.in);
        String input = pause.nextLine();
    }

    public static void main(String[] args) {
        // Crear objeto de la clase Lista
        Lista filaBanco = new Lista();

        // Inicializacion de variables y escaner
        Scanner read = new Scanner(System.in);
        String nombre, op;
        boolean isRunning = true;

        // Menu
        while (isRunning) {

            clear();
            System.out.print(
                    "Banco\n1) agregar usuario\n2) eliminar inicio\n3)eliminar final\n3) mostrar usuarios\n4) salir\nopcion: ");
            op = read.nextLine();
            switch (op) {
                case "1":
                    // Guardar nombre de cliente
                    System.out.print("Nuevo cliente: ");
                    nombre = read.nextLine();
                    filaBanco.insertar(nombre);
                    break;

                case "2":
                    if (filaBanco.isListEmpty()) {
                        System.out.println("\nLa lista esta vacia");
                    } else {
                        filaBanco.eliminar();
                        System.out.println("\nEliminado");
                    }
                    pause();
                    break;
                case "3":
                    if (filaBanco.isListEmpty()) {
                        System.out.println("\nLa lista esta vacia");
                    } else {
                        filaBanco.eliminar();
                        System.out.println("\nEliminado");
                    }
                    pause();
                    break;


                case "4":
                    if (filaBanco.isListEmpty()) {
                        System.out.println("\nLa lista esta vacia");
                    } else {
                        System.out.println("");
                        filaBanco.mostrar(); // Imprimir clientes
                    }
                    pause();
                    break;

                case "5":
                    isRunning = false;
                    break;

                default:
                    System.out.println("\nOpcion no valida");
                    pause();
                    break;
            }
        }

        read.close(); // Cerrar escaner
    }
}
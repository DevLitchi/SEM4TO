import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Hola mundo versión arreglos");
        int[][] a = new int[10][10]; // Matriz de minas
        char[][] r = new char[10][10]; // Matriz de visualización

        int tamaño = a.length;
        int x = 0;
        int y = 0;

        // Generar matriz de minas aleatorias
        for (int j = 0; j < tamaño; j++) {
            for (int i = 0; i < tamaño; i++) {
                a[i][j] = (int) (Math.random() * 2); // 0 o 1
            }
        }

        // Inicializar matriz de visualización con asteriscos
        for (int j = 0; j < tamaño; j++) {
            for (int i = 0; i < tamaño; i++) {
                r[i][j] = '*';
            }
        }

        // Mostrar la plantilla inicial
        mostrarPlantilla(r);

        // Bucle para descubrir celdas hasta que se encuentre una mina
        while (true) {
            System.out.println("Posición para descubrir:");
            System.out.print("X : ");
            x = lector.nextInt();
            System.out.print("Y : ");
            y = lector.nextInt();

            if (x >= 0 && x < tamaño && y >= 0 && y < tamaño) {
                // Verificar si hay una mina en la posición seleccionada
                if (a[x][y] == 1) {
                    System.out.println("¡Explotaste!");
                    break; // Terminar el juego si se encuentra una mina
                } else {
                    // Descubrir la celda y mostrar la plantilla actualizada
                    descubrirCelda(a, r, x, y);
                    mostrarPlantilla(r);
                }
            } else {
                System.out.println("Posición inválida.");
            }
        }
    }

    // Método para mostrar la plantilla de juego
    public static void mostrarPlantilla(char[][] r) {
        int tamaño = r.length;
        System.out.println("Plantilla de juego:");
        System.out.print("   ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 0; j < tamaño; j++) {
            System.out.print(j + "| ");
            for (int i = 0; i < tamaño; i++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para descubrir una celda y mostrar el radio alrededor de ella
    public static void descubrirCelda(int[][] a, char[][] r, int x, int y) {
        int tamaño = a.length;
        r[x][y] = (char) (a[x][y] + '0'); // Descubrir la celda

        // Mostrar el radio de una celda alrededor de la posición seleccionada
        for (int j = Math.max(0, y - 1); j <= Math.min(tamaño - 1, y + 1); j++) {
            for (int i = Math.max(0, x - 1); i <= Math.min(tamaño - 1, x + 1); i++) {
                if (r[i][j] == '*') {
                    r[i][j] = (char) (a[i][j] + '0');
                }
            }
        }
    }
}

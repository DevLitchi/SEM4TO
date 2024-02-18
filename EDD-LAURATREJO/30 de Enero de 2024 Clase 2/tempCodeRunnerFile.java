import java.util.Scanner;

public class buscaminas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Hola mundo version arreglos");
        int[][] a = new int[10][10];
        char[][] r = new char[10][10]; // arreglo de respuestas

        int cant = a.length;
        int x = 0;
        int y = 0;
        int s = 0; // Declare variables s, x, and y

        for (int j = 0; j < cant; j++) { // renglones
            for (int i = 0; i < cant; i++) { // columnas
                a[i][j] = (int) (Math.floor(Math.random() * 2 + 0));
                r[i][j] = '*';
                System.out.print(a[i][j]);

            }
            System.out.println();
        }
        System.out.println("Posicion de las minas");
        System.out.print("X : "); // Remove 's:' from the print statement
        if (a[x][y] == 1) {
            System.out.println("Explotaste");
        }
        for (int j = 0; j < cant; j++) {
            for (int i = 0; i < cant; i++) {
                if (j == y && i == x) {
                    r[x][y] = '0';
                    r[x - 1][y - 1] = (char) a[x - 1][y - 1];
                    r[x - 1][y] = (char) a[x - 1][y];
                    r[x - 1][y + 1] = (char) a[x - 1][y + 1];
                    r[x][y - 1] = (char) a[x][y - 1];
                    r[x][y + 1] = (char) a[x][y + 1];
                    r[x + 1][y] = (char) a[x + 1][y];
                    r[x + 1][y - 1] = (char) a[x + 1][y - 1];
                    r[x + 1][y + 1] = (char) a[x + 1][y + 1];
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}
import java.util.Scanner;

class Nodo {
    String elemento;
    Nodo sig;

}

class Lista {
    public Nodo inicio;
    public Nodo fin;
    public Nodo aux;
    public int opcion;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void insertar(String nombre) {
        Nodo nuevo = new Nodo();
        nuevo.elemento = nombre;
        nuevo.sig = null;
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            // fin.sig = nuevo;
            // fin = nuevo;
            aux = inicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;

        }
    }

    public void mostrar() {
        Nodo recorrer = inicio;
        int i = 0;
        if (inicio == null) {
            System.out.println("No hay elementos en la fila");
        } else {

            while (recorrer != null) {
                i++;
                System.out.println("Tu turno es " + i + " en la fila " + recorrer.elemento);
                recorrer = recorrer.sig;
            }
        }
        
    }

    public void eliminar() {
        Nodo aux = new Nodo();
        aux = inicio;
        if (inicio != null) {
            inicio = inicio.sig;
            aux.sig = null;
        } else {
            System.out.println("No hay elementos en la fila");
        }
    }

}

public

class Principal {
    public static void main(String[] args) {
        Lista filaBanco = new Lista();
        Scanner lector = new Scanner(System.in);
        Nodo alumno = new Nodo();
        alumno.sig = null;
        String nombre, nombre2, nombre3, nombre4, nombre5, nombre6, nombre7;
        System.out.println("Cliente:");
        nombre = lector.nextLine();
        filaBanco.insertar(nombre);

        System.out.println("Cliente 2 :");
        nombre2 = lector.nextLine();
        filaBanco.insertar(nombre2);

        System.out.println("Cliente 3:");
        nombre3 = lector.nextLine();
        filaBanco.insertar(nombre3);

        System.out.println("Cliente 4:");
        nombre4 = lector.nextLine();
        filaBanco.insertar(nombre4);

        System.out.println("Cliente 5:");
        nombre5 = lector.nextLine();
        filaBanco.insertar(nombre5);

        System.out.println("Cliente 6:");
        nombre6 = lector.nextLine();
        filaBanco.insertar(nombre6);

        System.out.println("Cliente 7:");
        nombre7 = lector.nextLine();
        filaBanco.insertar(nombre7);

        filaBanco.mostrar();
    }
}
  
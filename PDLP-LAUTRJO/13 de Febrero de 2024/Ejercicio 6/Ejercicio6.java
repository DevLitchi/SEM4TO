
//Ejercicio 6 Validaciones
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 6 Validaciones");
        String nombre, paterno, materno;
        String mnac, dnac;

        do {
            System.out.println("Nombre: ");
            nombre = lector.nextLine();
        } while (valida.onlystr(nombre) == false);

        do {
            System.out.println("Paterno: ");
            paterno = lector.nextLine();
        } while (valida.onlystr(paterno) == false);

        do {
            System.out.println("Materno: ");
            materno = valida.leeString();
        } while (valida.onlystr(materno) == false);

        System.out.println("Dia de nacimiento: ");
        dnac = lector.nextLine();

        do {
            System.out.print("Mes de nacimiento: ");
            mnac = lector.nextLine();
        } while (valida.num(mnac) == false ||
                valida.Rngmnth(Integer.parseInt(mnac), 1, 12) == false);
        mnac = (mnac.length() == 1) ? "0" + mnac : mnac;

        // if (mnac.length()==1)
        // mnac = "0"+mnac;

        System.out.println("El nombre es " + nombre);
        System.out.println("El mes es " + mnac);
        // valida.saludo();

        /*
         * int ahoy=0, edad=0, mhoy=0, dhoy=0;
         * String anac, mnac, dnac;
         * paterno, materno, iniciales, rfc;
         * System.out.print("Año de nacimiento: ");
         * anac = lector.nextLine();
         * System.out.print("Mes de nacimiento: ");
         * mnac = lector.nextLine();
         * if (mnac.length()==1)
         * mnac = "0"+mnac;
         * String nuevomes= String.format("%02d", Integer.parseInt(mnac));
         * System.out.println("mes en 2 posiciones " + mnac);
         * System.out.println("mes con formato " + nuevomes);
         * 
         * System.out.print("Dia de nacimiento: ");
         * dnac = lector.nextLine();
         * //lector.nextLine(); //truco para el enter anterior
         * 
         * do{
         * System.out.println("Paterno: ");
         * paterno = lector.nextLine();
         * }while(paterno=="");
         * do{
         * System.out.println("Materno: ");
         * materno = lector.nextLine();
         * }while(materno=="");
         * iniciales = paterno.substring(0,1)
         * + materno.substring(0,1)
         * + nombre.substring(0,1);
         * rfc = iniciales + String.valueOf(anac) + String.valueOf(mnac)
         * + String.valueOf(dnac);
         * //las letras sean mayusculas
         * //el mes y dia 2 posiciones
         * // mes sea de 1 al 12
         * // dia sea del 1 al 31
         * // pedimos en cuantos digitos ???
         * // año especificar en cuantos digitos, validar
         * //espacios vacios
         * String homoclave="";
         */

    }
}

// import java.util.Scanner;

// public class Ejercicio6 {
// public static void main(String[] args) {
// Scanner lector = new Scanner(System.in);

// System.out.println("Ejercicio de validaciones");
// String nombre, paterno, materno;
// String mnac, dnac, anac;

// do {
// System.out.println("Ingrese su nombre");
// nombre = lector.nextLine();
// } while (valida.main(nombre));
// do {
// System.out.println("Ingrese su apellido paterno");
// paterno = lector.nextLine();
// } while (valida.main(paterno) != false);

// materno = valida.leestring();

// System.out.println("Ingrese su dia de nacimiento");
// dnac = lector.nextLine();
// System.out.println("Ingrese su mes de nacimiento");
// mnac = lector.nextLine();
// System.out.println("Ingrese su año de nacimiento");
// anac = lector.nextLine();

// // Operador ternario

// mnac = (mnac.length() == 0) ? "No ingreso apellido materno" : mnac;
// // (mnac.length() == 0) es la condicion
// // ? es el operador ternario que se encarga de evaluar la condicion
// // Si la condicion es verdadera, se ejecuta el codigo que esta despues del ?
// // Si la condicion es falsa, se ejecuta el codigo que esta despues de los :

// System.out.println("Hola " + nombre + " " + paterno + " " + materno);
// }
// }
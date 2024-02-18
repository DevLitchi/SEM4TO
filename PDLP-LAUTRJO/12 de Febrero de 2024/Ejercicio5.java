import java.util.Scanner;
import java.util.stream.IntStream;
import java.time.Year;
import java.time.LocalDate;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre, paterno, materno, iniciales, rfc, añosenstring, inicialesyear, homoclave;
        int edad;
        Scanner lector = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now(); // Obtiene la fecha actual

        System.out.println("Año de Nacimiento");
        int year1 = lector.nextInt(); // En year 1 se almacena el año del usuario
        if (year1 > fechaActual.getYear()) { // Si el año es mayor al año actual, se imprime un mensaje de error
            System.out.println("Año de nacimiento no valido");
            return;
        }
        if (year1 < 1900 || year1 < 1000) { // Si el año es menor a 1900, se imprime un mensaje de error
            System.out.println("Año de nacimiento no valido");
            return;
        }

        // if (year1 > fechaActual.getYear()) { // Si el año es mayor al año actual, se
        // imprime un mensaje de error
        // System.out.println("Año de nacimiento no valido");
        // return;
        // }

        System.out.println("Mes de Nacimiento (MM)");
        int mes = lector.nextInt(); // En mes se almacena el mes del usuario ne formato (1-12)
        if (mes < 10) {
            if (mes == 01 || mes == 02 || mes == 03 || mes == 04 || mes == 05 || mes == 06 || mes == 07 || mes == 08 || mes == 09) {
            }
            System.out.println("0" + mes);
        }
        if (mes > 12 || mes < 1) { // Si el mes es mayor a 12 o menor a 1, se imprime un mensaje de error
            System.out.println("Mes de nacimiento no valido");
            return;
        }

        // if (mes ) { // Si el mes es menor a 10, se le agrega un 0 al inicio
        // mes = Integer.parseInt("0" + mes);
        // }

        // if (mes > 12 || mes < 1) { // Si el mes es mayor a 12 o menor a 1, se imprime
        // un mensaje de error
        // System.out.println("Mes de nacimiento no valido");
        // return;

        // }

        System.out.println("Dia de Nacimiento");
        int dia = lector.nextInt(); // En dia se almacena su dia de nacimiento

        // if (dia < 10) { // Si el dia es menor a 10, se le agrega un 0 al inicio
        // dia = Integer.parseInt("0" + dia);
        // }
        // if (dia > 31 || dia < 1) { // Si el dia es mayor a 31 o menor a 1, se imprime
        // un mensaje de error
        // System.out.println("Dia de nacimiento no valido");
        // return;

        // }

        System.out.println("Nombre");
        nombre = lector.next();

        System.out.println("Apellido Paterno");
        paterno = lector.next();

        System.out.println("Apellido Materno");
        materno = lector.next();

        rfc = paterno.substring(0, 2) + materno.substring(0, 1) + nombre.substring(0, 1);

        rfc = rfc.toUpperCase(); // Convierte las letras a mayusculas

        añosenstring = Integer.toString(year1).substring(2, 4) + Integer.toString(mes) + Integer.toString(dia);

        // Generar homo clave aleatoria q sea siempre la misma

        System.out.println("RFC: " + rfc + añosenstring);
        // Beign index = desde que posicion y endindex = hasta que posicion y cuantos
        // Hacer que las letras sean mayusculas y mes y dia con dos diguitos en vez de 1
        // = 01

    }
}
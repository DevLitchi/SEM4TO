import java.util.Scanner;
import java.time.Year;
import java.time.LocalDate;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now(); // Obtiene la fecha actual

        System.out.println("Año de Nacimiento");
        int year1 = lector.nextInt(); // En year 1 se almacena el año del usuario
        System.out.println("Mes de Nacimiento");
        int mes = lector.nextInt(); // En mes se almacena el mes del usuario ne formato (1-12)
        System.out.println("Dia de Nacimiento");
        int dia = lector.nextInt(); // En dia se almacena su dia de nacimiento

        int diaActual = fechaActual.getDayOfMonth(); // Obtiene el día del mes actual
        int mesActual = fechaActual.getMonthValue(); // Obtiene el mes actual
        int yearActual = fechaActual.getYear(); // Obtiene el año actual

        int diferyear = (yearActual - year1);
        int age = diferyear;

        if (mes > mesActual || (mes == mesActual && dia > diaActual)) {
            age--;
        }

        System.out.println("Tu edad es: " + age + " años");
        // Agregar los dias vividos caluclando años bisiestos

    }
}
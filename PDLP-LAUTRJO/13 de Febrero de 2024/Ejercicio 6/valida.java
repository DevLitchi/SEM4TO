import java.util.Scanner;

public class valida {

    public static void saludo() {
        System.out.println("hola mundo");
    }

    public static boolean strvacio(String dato) {
        if (dato == "")
            return true;
        else
            return false;
    }

    public static String leeString() {
        Scanner lector = new Scanner(System.in);
        String dato;
        do {
            dato = lector.nextLine();
        } while (valida.strvacio(dato) == true);
        return dato;
    }

    // validar los numeros
    public static boolean num(String dato) { // valida que sea entero
        int num = 0;
        try {
            num = Integer.parseInt(dato);
            return true;
        } catch (

        Exception e) {
            System.out.println(" Error ingrese un ENTERO " + e.getMessage());
            return false;
        }
    }

    public static boolean numPosit(String dato) { // valida que sea entero
        int num = 0;
        try {
            num = Integer.parseInt(dato);
            if (num > 0)
                return true;
            else
                return false;

        } catch (Exception e) {
            System.out.println(" Error ingrese un ENTERO " + e.getMessage());
            return false;
        }
    }

    public static boolean numNeg(String dato) { // valida que sea entero
        int num = 0;
        try {
            num = Integer.parseInt(dato);
            if (num < 0)
                return true;
            else
                return false;

        } catch (

        Exception e) {
            System.out.println(" Error ingrese un ENTERO " + e.getMessage());
            return false;
        }
    }

    public static boolean Rngmnth(int num, int liminf, int limsup) {
        if (num >= liminf && num <= limsup) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean onlystr(String dato) {
        if (dato.matches("[a-zA-Z]+")) { //
            return true;
        } else {
            return false;
        }
    }

}
import java.util.Scanner;

public class Ej12 {
    public static Scanner sc = null;
    public static void ejercicio1() {
        System.out.println("1. SQL es: ");
        System.out.println("\ta) Un SGBD");
        System.out.println("\tb) Una base de datos");
        System.out.println("\tc) Un modelo de datos");
        System.out.println("\td) Un lenguaje de base de datos");
        String respuesta = sc.nextLine();
        boolean opcioncorrecta = false;
        int cantidad = 0;
        switch (respuesta){
            case "d":
                System.out.println("La respuesta es correcta");
                cantidad++;
            case "a","b","c":
                System.out.println("La respuesta es incorrecta");
        }

    }
    public static void main(String[] args) {
        ejercicio1();
    }
}

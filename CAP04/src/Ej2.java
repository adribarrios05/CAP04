import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) throws NumberFormatException, Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu hora actual(solo hora, sin minutos): ");
        try {
        int hora = sc.nextInt();
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if (hora >=0 && hora <= 5 || hora >=21 && hora <=23) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Error. Has introducido mal la hora");
        }
        } catch (NumberFormatException e) {
            System.out.println("No ha introducido una hora");
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado");
        }
        sc.close();
    }   
}

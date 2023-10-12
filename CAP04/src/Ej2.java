import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu hora actual(solo hora, sin minutos): ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if (hora >=0 && hora <= 5 || hora >=21 && hora <=24) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Error. Has introducido mal la hora");
        }
        sc.close();
    }
}

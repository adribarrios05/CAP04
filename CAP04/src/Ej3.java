import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) throws NumberFormatException, Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("El día 1 corresponde con el lunes");
                break;
            case 2:
                System.out.println("El día 2 corresponde con el martes");
                break;
            case 3:
                System.out.println("El día 3 corresponde con el miercoles");
                break;
            case 4:
                System.out.println("El día 4 corresponde con el jueves");
                break;
            case 5:
                System.out.println("El día 5 corresponde con el viernes");
                break;
            case 6:
                System.out.println("El día 6 corresponde con el sabado");
                break;
            case 7:
                System.out.println("El día 7 corresponde con el domingo");
                break;
        }
        sc.close();
    }
}

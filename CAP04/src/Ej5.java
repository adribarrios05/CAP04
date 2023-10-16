import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa realiza ecuaciones del tipo ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Introduzca el valor de b: ");
        double b = sc.nextDouble();
        double x = -b / a;
        if (a!=0){
            System.out.printf("x = %.2f ",x);
        } else {
            System.out.println("Esa ecuación no tiene solución");
        }
        sc.close();
    }
}

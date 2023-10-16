import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa realiza ecuaciones del tipo ax^2 + bx + c = 0");
        System.out.print("Introduzca el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Introduzca el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Introduzca el valor de c: ");
        double c = sc.nextDouble();
        double x = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        double y = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        if (a!=0 && b!=0){
            System.out.printf("x = %.2f , %.2f",x,y);
        } else {
            System.out.println("Esa ecuación no tiene solución");
        }
        sc.close();
    }
}
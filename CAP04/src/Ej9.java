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
        if (a==0) {
            Double x = -c/b;
            System.out.printf("La solución  l ecuación es .2f%n", x);
        } else {
            Double raiz = b*b-4*a*c;
            if (raiz<0) {
                System.out.println("La ecuación no tiene solución real");
            } else {
                Double x1 = (-b+Math.sqrt(raiz))/2*a;
                Double x2 = (-b-Math.sqrt(raiz))/2*a;
                System.out.printf("x1 = ", x1);
                System.out.printf("x2 = ", x2);
            }
        }
        sc.close();
    }
}
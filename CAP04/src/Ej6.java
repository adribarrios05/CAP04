import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula el tiempo que tarda un objeto que cae de una altura h");
        System.out.print("Introduce la altura(m): ");
        int h = sc.nextInt();
        double t = Math.sqrt((2*h)/9.81);
        System.out.printf("Un objeto que cae de una altura de %d metros tarda %.2f segundos en caer", h,t);
        sc.close();
    }
}

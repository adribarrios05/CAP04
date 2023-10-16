import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la media de tres notas");
        System.out.print("Introduce la primera nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Introduce la segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Introduce la tercera nota: ");
        int nota3 = sc.nextInt();
        double media = (double)(nota1+nota2+nota3)/3;
        System.out.printf("La media de las tres notas es: %.2f ",media);
        sc.close();
    }
}

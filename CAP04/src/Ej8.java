import java.util.Scanner;

public class Ej8 {
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
        System.out.printf("La media de las tres notas es: %.2f%n",media);
        sc.close();
        if (media < 5) {
            System.out.println("Su media da insuficiente");
        } else if (media >= 5 && media < 6) {
            System.out.println("Su media da suficiente");
        } else if (media >= 6 && media < 7) {
            System.out.println("Su media da bien");
        } else if (media >= 7 && media < 9) {
            System.out.println("Su media da notable");
        } else if (media >= 9 && media <= 10) {
            System.out.println("Su media da sobresaliente");
        } else {
            System.out.println("La nota ingresada no es válida. Debe estar en el rango de 0 a 10.");
        }
    }
}

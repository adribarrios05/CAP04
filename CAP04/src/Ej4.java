import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca las horas semanales trabajadas: ");
        int horas = sc.nextInt();
        sc.close();
        if (horas <= 40) { 
            System.out.println("Su salario semanal es de "+horas*12+" €");
        } else {
            System.out.println("Su salario semanal es de "+(40*12+(horas-40)*16)+" €"); 
        }
    }
}

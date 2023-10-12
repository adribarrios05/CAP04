import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un día de la semana (en minúsculas y sin tildes): ");
        String dia = sc.nextLine();
        String asignatura = "";

        switch (dia)  {
            case "lunes":
                asignatura= "Programación";
                break;
            case "martes":
                asignatura= "Lenguaje de marcas";
                break;
            case "miercoles":
                asignatura= "Lenguaje de marcas";
                break;
            case "jueves":
                asignatura= "Programación";
                break;
            case "viernes":
                asignatura= "FOL";
                break;
            default:
                asignatura= "libre";
                break;
        }
        System.out.println("El "+dia+" tienes "+asignatura+" a primera hora");
        sc.close();
    }
}

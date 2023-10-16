import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa averigua tu signo del zodiaco");
        System.out.print("Introduce tu mes de nacimiento(Solo la primera mayúscula y sin tildes): ");
        String mes = sc.nextLine();
        System.out.print("Introduce tu día de nacimiento: ");
        int dia = sc.nextInt();
        String signo = "";
        switch (mes) {
            case "Enero":
                if (dia <= 19 && dia <=31) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
                break;
            case "Febrero":
                if (dia <= 18 && dia <=28) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
                break;
            case "Marzo":
                if (dia <= 20 && dia <=31) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
                break;
            case "Abril":
                if (dia <=19 && dia <=30) {
                    signo = "Aries";
                } else {
                    signo = "Tauro";
                }
                break;
            case "Mayo":
                if (dia <=20 && dia <=31) {
                    signo = "Tauro";
                } else {
                    signo = "Géminis";
                }
                break;
            case "Junio":
                if (dia <=20 && dia <=30) {
                    signo = "Géminis";
                } else {
                    signo = "Cáncer";
                }
                break;
            case "Julio":
                if (dia <=22 && dia <=31) {
                    signo = "Cáncer";
                } else {
                    signo = "Leo";
                }
                break;
            case "Agosto":
                if (dia <=22 && dia <=31) {
                    signo = "Leo";
                } else {
                    signo = "Virgo";
                }
                break;
            case "Septiembre":
                if (dia <=22 && dia <=30) {
                    signo = "Virgo";
                } else {
                    signo = "Libra";
                }
                break;
            case "Octubre":
                if (dia <=22 && dia <=31) {
                    signo = "Libra";
                } else {
                    signo = "Escorpio";
                }
                break;
            case "Noviembre":
                if (dia <=21 && dia <=30) {
                    signo = "Escorpio";
                } else {
                    signo = "Sagitario";
                }
                break;
            case "Diciembre":
                if (dia <=21 && dia <=31) {
                    signo = "Sagitario";
                } else {
                    signo = "Capricornio";
                }
                break;
            default:
                signo = "Error. Asegúrate que has puesto bien la fecha";
        }
        System.out.println("Eres "+signo);
        sc.close();
    }
}

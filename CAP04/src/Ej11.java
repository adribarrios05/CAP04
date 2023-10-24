public class Ej11 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula los segundos que quedan para las 00:00");
        System.out.print("Introduzca la hora: ");
            int hora = Integer.parseInt(System.console().readLine());
            System.out.print("Itroduzca los minutos: ");
            int minutos = Integer.parseInt(System.console().readLine());
            long segundos = 86400-(hora*3600+minutos*60);
            System.out.println("Faltan "+segundos+" segundos para media noche");
    }
}

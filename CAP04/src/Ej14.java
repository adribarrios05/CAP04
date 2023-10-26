public class Ej14 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula si un número es divisible entre 2 y/o 5");
        System.out.print("Introduce un número: ");
        int a = Integer.parseInt(System.console().readLine());
        if (a%2==0){
            System.out.print("Este número es par ");
            if(a%5==0)
                System.out.print("y divisible entre 5");
            else
                System.out.print("pero no es divisible entre 5");
        }
        else {
            System.out.print("Este número no es par ");
            if(a%5==0)
                System.out.print("pero sí es divisible entre 5");
            else
                System.out.print("ni divisible entre 5");
        }
    }
}

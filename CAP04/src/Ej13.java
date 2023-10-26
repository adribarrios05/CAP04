import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa ordena tres números introducidos de mayor a menor");
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();
        sc.close();
        if (a>b && a>c){
            System.out.print(a+" > ");
            if (b>c)
                System.out.print(b+" > "+c);
            else
                System.out.print(c+" > "+b);
        }
        if (b>a && b>c){
            System.out.print(b+" > ");
            if (a>c)
                System.out.print(a+" > "+c);
            else
                System.out.print(c+" > "+a);
        }
        if (c>a && c>b){
            System.out.print(c+" > ");
            if (a>b)
                System.out.print(a+" > "+b);
            else
                System.out.print(b+" > "+a);
        }
    }
}

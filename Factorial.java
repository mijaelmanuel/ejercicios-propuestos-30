import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        long factorial = 1;
        int contador = 1;

        while (contador <= n) {
            factorial = factorial * contador;
            contador++;
        }

        System.out.println("Factorial = " + factorial);
    }
}
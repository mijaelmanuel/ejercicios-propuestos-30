import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de términos: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int contador = 1;

        while (contador <= n) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;

            contador++;
        }
    }
}
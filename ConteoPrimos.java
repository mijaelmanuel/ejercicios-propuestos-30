import java.util.Scanner;

public class ConteoPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el límite: ");
        int n = sc.nextInt();

        int cantidad = 0;

        for (int i = 2; i <= n; i++) {
            int divisores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                cantidad++;
            }
        }

        System.out.println("Cantidad de números primos: " + cantidad);
    }
}
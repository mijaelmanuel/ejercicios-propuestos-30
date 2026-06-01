import java.util.Scanner;

public class SalirNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo encontrado.");
                break;
            }

            System.out.println("Número válido: " + numero);
        }
    }
}
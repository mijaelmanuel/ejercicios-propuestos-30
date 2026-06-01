import java.util.Scanner;

public class SumarPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                continue;
            }

            suma += numero;
        }

        System.out.println("Suma de positivos: " + suma);
    }
}
import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        int suma = 0;

        while (numero > 0) {
            suma = suma + (numero % 10);
            numero = numero / 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}
import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número (0 para terminar): ");
        int numero = sc.nextInt();

        int menor = numero;

        while (numero != 0) {

            if (numero < menor) {
                menor = numero;
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("El menor número es: " + menor);
    }
}
import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        int numero = sc.nextInt();

        String binario = "";

        while (numero > 0) {
            binario = (numero % 2) + binario;
            numero = numero / 2;
        }

        System.out.println("Binario: " + binario);
    }
}
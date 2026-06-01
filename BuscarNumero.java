import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {5, 10, 15, 20, 25};

        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                encontrado = true;
                System.out.println("Encontrado en la posición " + i);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado");
        }
    }
}
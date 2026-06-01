import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                System.out.println("Edad inválida");
                continue;
            }

            System.out.println("Edad válida: " + edad);
            break;
        }
    }
}
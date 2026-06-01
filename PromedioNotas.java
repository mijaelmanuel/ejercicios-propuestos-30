import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double suma = 0;
        int cantidad = 0;

        System.out.print("Ingrese una nota (-1 para terminar): ");
        nota = sc.nextDouble();

        while (nota != -1) {
            suma = suma + nota;
            cantidad++;

            System.out.print("Ingrese una nota (-1 para terminar): ");
            nota = sc.nextDouble();
        }

        if (cantidad > 0) {
            System.out.println("Promedio: " + (suma / cantidad));
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}
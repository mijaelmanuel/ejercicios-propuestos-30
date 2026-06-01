import java.util.Scanner;

public class JuegoClave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "java123";

        for (int intento = 1; intento <= 3; intento++) {

            System.out.print("Ingrese la clave: ");
            String clave = sc.nextLine();

            if (clave.equals(claveCorrecta)) {
                System.out.println("Acceso concedido");
                break;
            }

            System.out.println("Clave incorrecta");

            if (intento == 3) {
                System.out.println("Intentos agotados");
            }
        }
    }
}
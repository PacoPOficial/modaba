package ejDespliegue;

import java.util.Scanner;


//Comentario ejemplo
public class ejDespliegue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Introduce un numero positivo");
            return;
        }

        String palabra = "Modaba";

        String nuevaPalabra = anadirA(palabra, n);

        System.out.println("Resultado:\n" + nuevaPalabra);
    }

    private static String anadirA(String palabra, int veces) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < veces; i++) {
            resultado.append(palabra).append("\n"); 
            palabra += "a"; 
        }

        return resultado.toString();
    }
}

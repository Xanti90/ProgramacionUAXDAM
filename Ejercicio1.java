package Feedback3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();

        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        System.out.println("La frase invertida es: " + fraseInvertida);

        entrada.close();
    }

}

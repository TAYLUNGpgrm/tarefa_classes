package Matematica.Math1;

import java.util.Scanner;

/**
 * @author Álef Dutra
 * Classe responsável por gerar a lógica da tabuada.
 */
public class Tabuada {

    Scanner sc = new Scanner(System.in);

    /**
     * @param number define o início do loop.
     */
    public void mathTabuada(int number) {

        while(number > 0) {
            System.out.println("Digite o primeiro numero da multiplicação da tabuadan \nPRESSIONE 0, se quiser parar o programa: ");
            number = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}
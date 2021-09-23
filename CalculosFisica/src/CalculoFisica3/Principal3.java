package CalculoFisica3;

import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1;
        float num2;

        try {
            System.out.println("Digite a constante");
            num1 = teclado.nextFloat();
        } catch (Exception ex) {
            teclado = new Scanner(System.in);
            num1 = 0;
        }

        try {
            System.out.println("Digite a deformação");
            num2 = teclado.nextFloat();
        } catch (Exception ex) {
            num2 = 0;
        }
        Elastica calc = new Elastica();
        System.out.printf("A força elástica é: %.2f N", calc.elastica(num1, num2));
        teclado.close();
    }
}
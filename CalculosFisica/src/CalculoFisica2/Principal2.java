package CalculoFisica2;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1;
        float num2;

        try {
            System.out.println("Digite a força");
            num1 = teclado.nextFloat();
        } catch (Exception ex) {
            teclado = new Scanner(System.in);
            num1 = 0;
        }

        try {
            System.out.println("Digite o tempo");
            num2 = teclado.nextFloat();
        } catch (Exception ex) {
            num2 = 0;
        }
        Impulso calc = new Impulso();
        System.out.printf("O impulso é: %.2f N.s", calc.impulso(num1, num2));
        teclado.close();
    }
}
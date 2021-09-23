package CalculosFisica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1;
        float num2;

        try {
            System.out.println("Digite a massa");
            num1 = teclado.nextFloat();
        } catch (Exception ex) {
            teclado = new Scanner(System.in);
            num1 = 0;
        }

        try {
            System.out.println("Digite a gravidade");
            num2 = teclado.nextFloat();
        } catch (Exception ex) {
            num2 = 0;
        }
        Peso calc = new Peso();
        System.out.printf("O peso é: %.2f N", calc.multiplicar(num1, num2));
        teclado.close();
    }
}
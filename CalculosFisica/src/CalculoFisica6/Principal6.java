package CalculoFisica6;

import java.util.Scanner;

public class Principal6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1;
        float num2;
        float num3;

        try {
            System.out.println("Digite a velocidade");
            num1 = teclado.nextFloat();
        } catch (Exception ex) {
            teclado = new Scanner(System.in);
            num1 = 0;
        }

        try {
            System.out.println("Digite a aceleração");
            num2 = teclado.nextFloat();
        } catch (Exception ex) {
            num2 = 0;
        }
        try {
            System.out.println("Digite o tempo");
            num3 = teclado.nextFloat();
        } catch (Exception ex) {
            num3 = 0;
        }
        MRUV calc = new MRUV();
        System.out.printf("O MRUV é: %.2f m/s", calc.variado(num1, num2, num3));
        teclado.close();
    }
}
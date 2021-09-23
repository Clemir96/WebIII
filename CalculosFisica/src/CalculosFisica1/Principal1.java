package CalculosFisica1;

import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1;
        float num2;
        float num3;

        try {
            System.out.println("Digite a massa");
            num1 = teclado.nextFloat();
        } catch (Exception ex) {
            teclado = new Scanner(System.in);
            num1 = 0;
        }

        try {
            System.out.println("Digite a velocidade");
            num2 = teclado.nextFloat();
        } catch (Exception ex) {
            num2 = 0;
        }
        try {
            System.out.println("Digite a velocidade");
            num2 = teclado.nextFloat();
        } catch (Exception ex) {
            num2 = 0;
        }
        try {
            System.out.println("Digite o raio");
            num3 = teclado.nextFloat();
        } catch (Exception ex) {
            num3 = 0;
        }
        Forca calc = new Forca();
        System.out.printf("A força centrípeta é: %.2f N", calc.forca(num1, num2, num3));
        teclado.close();
    }
}

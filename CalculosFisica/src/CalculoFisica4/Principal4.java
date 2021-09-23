package CalculoFisica4;

import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1;
        float num2;

        try {
            System.out.println("Digite a velocidade");
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
        Velocidade calc = new Velocidade();
        System.out.printf("A velocidade média é: %.2f Km/h", calc.velocidade(num1, num2));
        teclado.close();
    }
}
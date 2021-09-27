package exercicios;

import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		int jogador, computador;
		
		int scoreJogador = 0;
		int scoreComputador = 0;
		try (Scanner leia = new Scanner(System.in)) {
			{
				System.out.println("1. Pedra");
				System.out.println("2. Papel");
				System.out.println("3. Tesoura");
				System.out.print("Digite a opção desejada: ");
				jogador = leia.nextInt();
				System.out.println("");
			
				switch (jogador) {
				case 1:
					System.out.println("Jogador escolheu: Pedra");
					break;
				case 2:
					System.out.println("Jogador escolheu: Papel");
					break;
				case 3:
					System.out.println("Jogador escolheu: Tesoura");
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
			
				computador = (int) (Math.random() * 3 + 1);
				switch (computador) {
				case 1:
					System.out.println("Computador escolheu: Pedra");
					break;
				case 2:
					System.out.println("Computador escolheu: Papel");
					break;
				case 3:
					System.out.println("Computador escolheu: Tesoura");
					break;
				}
				
				if (jogador == computador) {
					System.out.println("EMPATE");
				} else {
					if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
							|| (jogador == 3 && computador == 2)) {
						System.out.println("JOGADOR VENCEU");
						scoreJogador = scoreJogador + 1;
					} else {
						System.out.println("COMPUTADOR VENCEU");
						scoreComputador = scoreComputador + 1;
					}
				}
				
				System.out.println("");
				
			}
		}
	}
}
package roboVirus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		Scanner ler = new Scanner(System.in);

		int tamanhoSala;
		int distanciaPercorrida = 0;
		int direcao;

		System.out.println("Digite o tamanho da sala em centímetros quadrados:");
		tamanhoSala = ler.nextInt();

		System.out.println("1 = Frente, 2 = Trás, 3 = Direita, 4 = esquerda");

		while (tamanhoSala > distanciaPercorrida) {
			System.out.println("\n-------------------------------------------------------------");
			System.out.println("Digite a direcao que o robo deve andar: ");
			System.out.println("-------------------------------------------------------------");
			direcao = ler.nextInt();
			if (direcao >= 1 && direcao <= 4) {
				distanciaPercorrida += 10;

				double random = Math.random();
				DecimalFormat df = new DecimalFormat("#.####");
				String format = df.format(random);
				format = format.replace(",", ".");
				random = Double.parseDouble(format);

				if (random >= 0 && random <= 0.4589) {
					System.out.println(
							"O robô encontrou uma colônia de vírus e deve acionar a emissão de raios UV para desinfectar o ambiente.");
				}
				if (random > 0.4589 && random < 0.7999) {
					System.out.println(
							"O robô encontrou um ser humano e, portanto, deverá escolher outra direção para movimentar-se.");
				}
				if (random >= 0.7999) {
					System.out.println(
							"O robô encontrou um obstáculo (uma parede ou um equipamento e, portanto, deverá escolher outra direção para movimentar-se.");
				}

			} else {
				System.err.println("[ERRO] Direcao invalida, favor informar nova direcao!");
				Thread.sleep(100);
			}

		}

		System.out.println("\n\n#########################################################");
		System.out.println("O Robo percorreu todos os " + tamanhoSala + "cm quadrados da sala!");
		System.out.println("#############################################################");

	}
}

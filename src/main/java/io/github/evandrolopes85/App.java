package io.github.evandrolopes85;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Selecione o exercicio");
		System.out.println("1 - Escada");
		System.out.println("2 - Validacao");
		System.out.println("3 - Anagrama");
		int op = entrada.nextInt();

		switch (op) {
		case 1: {
			System.out.println("Digite o tamanho da escada");
			entrada.nextLine();
			int tamanho = entrada.nextInt();
			System.out.println(Escada.exibirEscada(tamanho));
			break;
		}
		case 2: {
			System.out.println("Digite a senha");
			entrada.nextLine();
			String str = entrada.nextLine();
			if (!SenhaForte.validandoTamanho(str)) {
				System.out.printf("%d\n", 6 - str.length());
			}
			break;
		}
		case 3: {
			System.out.println("Digite a palavra");
			entrada.nextLine();
			String str = entrada.nextLine();
			System.out.println(Anagrama.quantidadeDeAnagramas(str));
			break;
		}
		}

	}
}

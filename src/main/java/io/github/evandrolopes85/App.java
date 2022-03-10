package io.github.evandrolopes85;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		
		do {

			System.out.println("Selecione o exercicio");
			System.out.printf("%2d - Exercicio 1 - Escada\n", 1);
			System.out.printf("%2d - Exercicio 2 - Validacao\n", 2);
			System.out.printf("%2d - Exercicio 3 - Anagrama\n", 3);
			System.out.printf("%2d - Sair\n", -1);

			opcao = entrada.nextInt();
			
			if(opcao == -1) break;

			switch (opcao) {
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
			
			System.out.println();
		} while (true);
	}
}

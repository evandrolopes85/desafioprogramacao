package io.github.evandrolopes85;

import java.util.HashMap;
import java.util.Map;

public class Anagrama {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(quantidadeDeAnagramas("ovo"));
//	}

	/*
	 * Metodo que verica quantos anagrama tem na string
	 * fazendo o fatorial da quantidade de letras na string, e dividir
	 * pela multiplicao do fatorial de cada letra repetida 
	 */
	
	public static int quantidadeDeAnagramas(String s) {
		// Uma mapa para armazenar as letras como chave
		// e a quantidade de letras iguais no valor
		Map<Character, Integer> map = new HashMap<>();
		
		int soma = 1; // Variavel que vai armazer o resultado dos fatoriais
		
		for (int i = 0; i < s.length(); i++) {
			// adiciona as letras(chave) e soma o total de letras iguais(valor)
			map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
		}

		// calcula o total dos fatoriais das letras iguais
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			soma *= fatorial(entry.getValue());
		}
		
//		for (int i = 0; i < map.size(); i++) {
//			if (map.get(s.charAt(i)) > 1) {
//			soma *= fatorial(map.get(s.charAt(i)));
//			}
//		}

		return fatorial(s.length()) /soma;  // retorna o fatorial total
	} // fim do m�todo quantidadeDeAnagramas

	// m�todo para calcular o fatorial de um valor
	public static int fatorial(int s) { 
		int fat = 1; // armazena o resultado do fatorial

		// multiplica todos os valores de 1 at� o tamanho de s
		for (int i = 1; i <= s; i++) {
			fat *= i;
		}

		return fat; // retorna o fatorial
	} // fim do m�todo fatorial
} // fim da classe Anagrama

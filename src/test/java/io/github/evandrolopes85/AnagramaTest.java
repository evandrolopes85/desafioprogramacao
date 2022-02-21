package io.github.evandrolopes85;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramaTest {

	@Test
	public void test() {
		String entrada = "banana"; // Entrada
		
		// Variavel que armazena a quantidade de anagramas
		int anagramas = Anagrama.quantidadeDeAnagramas(entrada);
		
		assertEquals(anagramas, 60); // Verifica se o total de anagramas é o esperado
	}

}

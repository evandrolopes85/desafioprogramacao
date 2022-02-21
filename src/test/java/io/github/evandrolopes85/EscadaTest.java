package io.github.evandrolopes85;

import static org.junit.Assert.*;

import org.junit.Test;

public class EscadaTest {
	
	
    @Test
    public void testConstrutorDeEscada() {
        // String esperada
        String textoEsperado = "     *\n"
                             + "    **\n"
                             + "   ***\n"
                             + "  ****\n"
                             + " *****\n"
                             + "******\n";
        
        assertEquals(textoEsperado, Escada.exibirEscada(6)); // retorna true se a String estiver formada da forma esperada
    }
 
}

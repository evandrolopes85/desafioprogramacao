package io.github.evandrolopes85;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
 
public class SenhaForteTest {
 
    @Test
    public void testValidandoTamanho() {
        assertTrue(SenhaForte.validandoTamanho("Ya3L5rr"));
    }
 
    @Test
    public void testVerificandoDigito() {
        assertTrue(SenhaForte.verificadorDeDigito("labrad0r"));
    }
 
    @Test
    public void testVerificaLetraMinusculaEMaiuscula() {
        assertTrue(SenhaForte.verificadorDeLetraMinusculaEMaiuscula("laBrad0r"));
    }
 
    @Test
    public void testVerificaCaracterEspecial() {
        assertTrue(SenhaForte.verificadorDeCaracterEspecial("labr@d0r"));
    }
}

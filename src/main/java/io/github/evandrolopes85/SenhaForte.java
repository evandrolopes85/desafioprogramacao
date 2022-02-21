package io.github.evandrolopes85;

import java.util.regex.Pattern;

public class SenhaForte {
	public static boolean validandoTamanho(String s) {
        return (s.length() >= 6); // retorna true se o tamanho da string tem a quantidade minima de 6 caracteres
    } // fim do método validandoTamanho
 
    public static boolean verificadorDeDigito(String s) {
        // Usa expressão regular para verificar se na String tem um ou mais digitos
        // Utilizando a classe de caracter pré-definida \\d é o mesmo que [0-9]
        return Pattern.compile("\\d+").matcher(s).find();
    } // fim do método verificadorDeDigito
 
    public static boolean verificadorDeLetraMinusculaEMaiuscula(String s) {
        // Usa a expressão regular para verificar se na String tem uma ou mais letras
        // maiscula
        // Utilizando a classe de caracter intervalor [a-zA-Z]
        return Pattern.compile("[a-zA-Z]+").matcher(s).find();
    } // fim do método verificadorDeLetraMaiuscula
 
    public static boolean verificadorDeCaracterEspecial(String s) {
        // Usa expressão regular para verificar se na String tem um ou mais caracter
        // especial
        return Pattern.compile("\\p{Punct}+").matcher(s).find();
    }// fim do método verificadorDeCaracterEspecial
}

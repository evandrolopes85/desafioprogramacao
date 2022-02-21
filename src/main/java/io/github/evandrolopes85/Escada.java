package io.github.evandrolopes85;

public class Escada {
 
    // Metodo que vai exibir a escada de *s
    public static String exibirEscada(int tamanho) {
        
        // Variavel que vai armazenar a StringBuilder com *
        // Uso StringBuilder porque ela me possibilita acrescentar um
        // novo caracter na String
        StringBuilder s = new StringBuilder(); 
        
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                /*
                 * Aqui faco o calculo das linhas e colunas para saber onde fica
                 * os espaços na String e onde fica os *s
                 * Se a soma das linhas e colunas forem igual ao tamanho da String -1
                 * ou maior ou igual tamanho então acrescento * se não acrescento espaços,
                 * como o comentario abaixo:
                 * 00 01 02 03 04 05
                 *                *
                 * 10 11 12 14 14 15
                 *             *  * 
                 * 20 21 22 23 24 25
                 *          *  *  * 
                 * 30 31 32 33 34 35
                 *       *  *  *  *  
                 * 40 41 42 43 44 45
                 *    *  *  *  *  *
                 * 50 51 52 53 54 55
                 * *  *  *  *  *  *
                 */
                if ((x + y == tamanho - 1) || (x + y >= tamanho))
                    s.append("*"); // adiciona * na String
                else
                    s.append(" ");
            } // fim do for interno // adiciona espaco na String
            
            s.append("\n"); //adiciona \n na String que indica para pular um linha
            
        } // fim do for externo
        
        return s.toString(); // retorna a string com a escada formatada
        
    } // fim do metodo exibirEscada
}
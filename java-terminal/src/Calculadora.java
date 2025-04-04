/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza oprações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Osmar Uemura
 * @version 1.0
 * @since 04/04/2025
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
}

// criando nossa documentação no formato html para disponibilizar via web
// no terminal executar o comando:
// javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java

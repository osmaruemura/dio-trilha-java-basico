public class Operadores {
    public static void main (String[] args) {

        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;

        numero ++;

        System.out.println(numero);

        int numeroA = 5;

        System.out.println(numeroA --);

        System.out.println(numeroA);

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 6;

        //String resultado = "";
        //if(a==b)
        //    resultado = "verdadeiro";
        //else
        //    resultado = "falso";

        String resultado = a == b ? "verdadeiro" : "falso";
        
        System.out.println(resultado);

        String nomeUm = "Osmar";
        String nomeDois = new String ("Osmar");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("fim");
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da agência:");
        //Obter pela scanner os valores digitados no terminal
        String agencia = scanner.next();

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por gentileza, digite o número da conta:");
        //Obter pela scanner os valores digitados no terminal
        int conta = scanner.nextInt();

        //Exibir as mensagens para o nosso usuário
        System.out.println("Agora, digite seu nome:");
        //Obter pela scanner os valores digitados no terminal
        String nome = scanner.next();

        //Exibir as mensagens para o nosso usuário
        System.out.println("E, seu sobrenome:");
        //Obter pela scanner os valores digitados no terminal
        String sobrenome = scanner.next();

        //Exibir as mensagens para o nosso usuário
        System.out.println("E para finalizar, digite o valor (R$) do seu primeiro depósito:");
        //Obter pela scanner os valores digitados no terminal
        float saldo = scanner.nextFloat();

        //Exibir a mensagem conta criada
        System.out.println("Olá cliente " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}

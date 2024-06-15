
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         // conhecer e importar a classe scanner
         // exibir as mensagens para o nosso usuario
        // obter pela classse scanner os valores digitados no terminal
        // exibir a mensagem da conta criada 

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Cássio Neves";
        double saldo = 1566.98;

        System.out.println("Por favor, digite o número da sua conta");
        String  numeroDigitado = scanner.next();
        
        System.out.println("Por favor, digite o número da Agência");
        String agenciaDigitada = scanner.next();
        
        System.out.println("Por favor, digite o seu nome");
        String nomeClienteDigitado = scanner.next();


            System.out.println("Olá, " +  nomeCliente + ". Obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );



    }
}

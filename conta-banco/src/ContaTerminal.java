import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner input = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuario
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Por gentileza, digite seu nome: ");
        String nome = input.next();

        System.out.println("Por favor, digite o número da sua conta:  ");
        int numero = input.nextInt();

        System.out.println("Agora precisamos de sua agência, por favor:  ");
        String agencia = input.next();

        System.out.println("Para finalizar, qual seu saldo atual? R$ ");
        double saldo = input.nextDouble();
   
        // Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + " Conta: " + numero + " e seu Saldo " + saldo + "já está disponível para saque.");
        
    }
}

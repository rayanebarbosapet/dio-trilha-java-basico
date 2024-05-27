import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nomeCliente;
        int numero;
        String agencia;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Olá, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("\n" + nomeCliente +" por favor, digite seu número de agência (Ex: 890-2): ");
        agencia = scanner.nextLine();

        System.out.println("\n" + nomeCliente + " por favor, digite seu número da conta bancária: ");
        numero = scanner.nextInt();

        System.out.println("\n Por último " + nomeCliente + " por favor, digite o saldo da sua conta bancária: ");
       saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", sua conta bancária é " + numero + " e o seu saldo é de R$"+ saldo + " já disponível para saque.");

        scanner.close();
    }
}

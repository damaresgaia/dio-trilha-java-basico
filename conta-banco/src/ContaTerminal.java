import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando o objeto Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo as informações fornecidas pelo usuário
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine(); // Leitura da agência

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt(); // Leitura do número da conta

        scanner.nextLine(); // Consumindo o newline deixado por nextInt()

        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = scanner.nextLine(); // Leitura do nome do cliente

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble(); // Leitura do saldo

        // Exibindo a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo
                + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
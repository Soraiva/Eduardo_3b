package banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando o objeto da conta bancária
        ContaBancaria conta = new ContaBancaria();
        
        System.out.println("--- CADASTRO DE CONTA BANCÁRIA ---");
        
        System.out.print("Digite o nome do cliente: ");
        conta.nomeCliente = scanner.nextLine();
        
        System.out.print("Digite o CPF do cliente: ");
        conta.cpf = scanner.nextLine();
        
        System.out.print("Digite o nome do banco: ");
        conta.nomeBanco = scanner.nextLine();
        
        System.out.print("Digite o número da agência: ");
        conta.agencia = scanner.nextInt();
        
        System.out.print("Digite o número da conta: ");
        conta.numeroConta = scanner.nextInt();
        
        // Exibindo os dados cadastrados e o saldo inicial
        System.out.println("\n--- CONTA CRIADA COM SUCESSO ---");
        System.out.println("Cliente: " + conta.nomeCliente + " | CPF: " + conta.cpf);
        System.out.println("Banco: " + conta.nomeBanco + " | Agência: " + conta.agencia + " | Conta: " + conta.numeroConta);
        System.out.println("Saldo Inicial: R$ " + conta.saldo);
        System.out.println("--------------------------------");
        
        // Solicitando o valor do saque
        System.out.print("\nDigite o valor que deseja SACAR: R$ ");
        double valorSaque = scanner.nextDouble();
        
        // Chamando o método sacar da classe ContaBancaria
        conta.sacar(valorSaque);
        
        // Exibindo o saldo final atualizado
        System.out.println("Saldo Atual: R$ " + conta.saldo);
        System.out.println("--------------------------------");
        
        scanner.close();
    }
}
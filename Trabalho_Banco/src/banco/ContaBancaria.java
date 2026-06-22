package banco;

public class ContaBancaria {
    // Atributos solicitados no enunciado
    public String nomeCliente;
    public String cpf;
    public String nomeBanco;
    public int agencia;
    public int numeroConta;
    public double saldo = 500.00; // Começa com R$ 500,00

    // Método para sacar que atualiza o saldo e retorna o novo saldo
    public double sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
        }
        return saldo;
    }
}
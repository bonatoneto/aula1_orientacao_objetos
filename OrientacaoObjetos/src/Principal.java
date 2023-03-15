
public class Principal {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.nomeCliente = "Joao";
		conta.numeroAgencia = 1;
		conta.numeroConta = 1;
		conta.limite = 1000;
		conta.saldo = 0;
		System.out.println("Nome do cliente: " + conta.nomeCliente);
		System.out.println("Numero da agencia: " + conta.numeroAgencia);
		System.out.println("Numero da conta: " + conta.numeroConta);
		System.out.println("Limite da conta: " + conta.limite);
		System.out.println("Saldo da conta: " + conta.saldo);
		
		System.out.print("\n");
		
		Conta conta1 = new Conta();
		conta1.nomeCliente = "Maria";
		conta1.numeroAgencia = 2;
		conta1.numeroConta = 2;
		conta1.limite = 2000;
		conta1.saldo = 0;
		System.out.println("Nome do cliente: " + conta1.nomeCliente);
		System.out.println("Numero da agencia: " + conta1.numeroAgencia);
		System.out.println("Numero da conta: " + conta1.numeroConta);
		System.out.println("Limite da conta: " + conta1.limite);
		System.out.println("Saldo da conta: " + conta1.saldo);
		
		conta.depositar(300);
		conta1.depositar(500);
		
		System.out.print("\n");
		
		System.out.println("Saldo do Joao: " + conta.saldo);
		System.out.println("Saldo da Maria: " + conta1.saldo);
		
		System.out.print("\n");
		
		if (conta.verificaSaldo(200) == true) {
			conta.sacar(200);
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Saldo do Joao: " + conta.saldo);
		} else {
			System.out.println("Nao foi possivel realizar o saque! Limite indisponivel.");
		}
		
		System.out.print("\n");
		
		System.out.println("Saldo da conta do Joao: " + conta.saldo);
		System.out.println("Limite da conta do Joao: " + conta.limite);
		System.out.println("Saldo disponivel: " + conta.calculaDisponivel(0));
	}
}

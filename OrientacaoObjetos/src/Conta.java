
public class Conta {
	public String nomeCliente;
	public int numeroAgencia;
	public int numeroConta;
	public float limite;
	public float saldo;
	
	public void depositar(float valor) {
		saldo = saldo + valor;
	}
		
	public void sacar(float valor ) {
		saldo = saldo - valor;
	}
	
	public boolean verificaSaldo(float valor) {
		if (saldo + limite >= valor) {
			return true;
		} else {
			return false;
		}
	}
	
	public float calculaDisponivel(float valor) {
		return saldo + limite;
	}
	
}
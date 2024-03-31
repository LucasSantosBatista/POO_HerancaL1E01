/**
 * 
 */
package view;

import model.ContaBancaria;
import model.ContaEspecial;
import model.ContaPoupanca;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class Contas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContaBancaria normal = new ContaBancaria();
		normal.setCliente("Pedro");
		normal.setNumConta(789);
		normal.setSaldo(1500);

		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setCliente("João");
		poupanca.setNumConta(123);
		poupanca.setSaldo(1000);
		poupanca.setDiaRendimento(5);

		ContaEspecial especial = new ContaEspecial();
		especial.setCliente("Maria");
		especial.setNumConta(456);
		especial.setSaldo(2000);
		especial.setLimite(1000);

		// Sacando um determinado valor das contas
		System.out.println("\nSaques:");
		normal.sacar(500);
		poupanca.sacar(200);
		especial.sacar(500);

		// Sacar um valor superior ao saldo
		System.out.println("\nTentando sacar um valor superior ao saldo (Conta Especial):");
		especial.sacar(3000);

		// Sacando um valor dentro do limite da conta especial e acima do limite
		System.out.println("\nSacando um valor dentro do limite e outro acima do limite (Conta Especial):");
		especial.sacar(1500); 
		especial.sacar(2000);

		// Depositando um determinado valor nas contas
		System.out.println("\nDepósitos:");
		normal.depositar(100);
		poupanca.depositar(500);
		especial.depositar(800); 

		// Mostrando o novo saldo do cliente, a partir da taxa de rendimento, para
		// Contas Poupança
		System.out.println("\nCalculando novo saldo após rendimento (Conta Poupança):");
		poupanca.calcularNovoSaldo(0.02f); // Taxa de rendimento de 2%

		// Mostrando os dados das contas de um cliente
		System.out.println("\nDados das Contas de um Cliente:");
		System.out.println(normal);
		System.out.println(poupanca);
		System.out.println(especial);

	}

}

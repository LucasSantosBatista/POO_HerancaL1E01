/**
 * 
 */
package model;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo(float taxaRendimento) {
		setSaldo(getSaldo() * (1 + taxaRendimento));
		System.out.println("Novo saldo após rendimento: R$" + getSaldo());
	}
}

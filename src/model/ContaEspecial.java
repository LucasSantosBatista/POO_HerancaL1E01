/**
 * 
 */
package model;

import javax.swing.JOptionPane;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class ContaEspecial extends ContaBancaria {
	private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(float saque) {
		if (saque > getSaldo() + limite) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente para o saque!");
		} else {
			setSaldo(getSaldo() - saque);
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
		}
	}
}

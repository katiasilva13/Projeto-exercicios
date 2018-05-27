package br.com.db1.start.exercicio08;

public class Agencia {
	
	private Conta conta;
	
	private Integer numero;
	
	private Integer digitoVerificador;
	
	public void calcularDigitoVerificador() {
		
	}
	
	public Boolean validarDigitoVerificador() {
		return null;		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}

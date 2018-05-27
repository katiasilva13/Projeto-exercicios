package br.com.db1.start.exercicio03;

public class Calculadora {
	
	
	private Double valor1;
	private Double valor2;
	private Double resultado;
	
	public Double somar(Double valor1, Double valor2) {
		return  resultado = valor1 + valor2;
	}
	
	public Double subtrair(Double valor1, Double valor2) {
		return  resultado = valor1 - valor2;
	}
	
	public Double dividir(Double valor1, Double valor2) {
		return  resultado = valor1 / valor2;
	}
	
	public Double multiplicar(Double valor1, Double valor2) {
		return  resultado = valor1 * valor2;
	}
	
	public int zerarCalculo() {
		return 0;
	}
		
	public Double exibirResultado() {
		return resultado;
	}
	
	public Calculadora() {
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

}

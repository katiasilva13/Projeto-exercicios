package br.com.db1.start.exercicio06;

public class Telefone {

	private Integer ddd;
	
	private Integer numero;

	private String telefoneFormatado;
	
	public String exibirTelefoneFormatado() {
		telefoneFormatado = ddd + "-" + numero;
		return telefoneFormatado;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	

}

package br.com.db1.start.exercicio06;

public class Endereco {

	TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	
	private Integer cep;
	

	public String getCepFormatado(){
		String cepFormatado = getCep().toString();
		cepFormatado = cepFormatado.substring(0,5)+ "-" + cepFormatado.substring(5,8);
		return cepFormatado;	
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
}

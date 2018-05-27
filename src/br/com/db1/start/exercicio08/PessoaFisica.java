package br.com.db1.start.exercicio08;

public class PessoaFisica {
	
	private Integer cpf;
	
	public String exibirCpfFormatado() {
		String cpfFormatado = cpf.toString();
		cpfFormatado = cpfFormatado.substring(0, 3) + "." + cpfFormatado.substring(3, 6) + "."
				+ cpfFormatado.substring(6, 9) + "-" + cpfFormatado.substring(9, 11);
		return cpfFormatado;
	}

	public Boolean validarCpf() {
		return null;
		
	}
	
	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

}

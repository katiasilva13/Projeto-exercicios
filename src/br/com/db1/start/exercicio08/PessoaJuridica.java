package br.com.db1.start.exercicio08;

public class PessoaJuridica {
	
private Integer cnpj;
	
	public String exibircnpjFormatado() {
		String cnpjFormatado = cnpj.toString();
		cnpjFormatado = cnpjFormatado.substring(0, 2) + "." + cnpjFormatado.substring(2, 5) + "."
				+ cnpjFormatado.substring(5, 8) + "/" + cnpjFormatado.substring(8, 12) + "-" + cnpjFormatado.substring(12, 14);
		return cnpjFormatado;
	}

	public Boolean validarCnpj() {
		return null;
		
	}

}

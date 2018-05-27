package br.com.db1.start.exercicio04;

import java.util.Date;
import java.util.List;

public class Pessoa {
	
	private List<Telefone> telefone;
	
	public Sexo sexo;
	
	private String nome;
	
	private Date dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

}

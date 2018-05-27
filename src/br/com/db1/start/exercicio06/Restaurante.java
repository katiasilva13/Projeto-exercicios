package br.com.db1.start.exercicio06;

import java.util.Date;
import java.util.List;

import br.com.db1.start.exercicio04.Telefone;

public class Restaurante {
	
	private Endereco endereco;
	
	private List<Pedido> pedido;
	
	private List<Telefone> telefone;

	private String nome;
	
	private Boolean serveAlmoco;
	
	private Boolean serveJantar;
	
	private Boolean serveCafeDaManha;
	
	
	public void gerarFaturamento(Date dataInicial, Date dataFinal) {
		
	}
	
	
	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}

	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJantar() {
		return serveJantar;
	}

	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}

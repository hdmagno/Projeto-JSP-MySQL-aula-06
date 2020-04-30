package entity;

import java.io.Serializable;

public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private Double preco;
	private String imagem;
	
	public Produto() {
	}

	public Produto(Long id, String nome, Double preco, String imagem) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	@Override
	public String toString() {
		return "id: " 
				+ id 
				+ ", " 
				+ nome 
				+ ", " 
				+ String.format("R$%.2f", preco) 
				+ ", " 
				+ imagem;
				
	}

	
}

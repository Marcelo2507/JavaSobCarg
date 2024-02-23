package Sobrecargametodos.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	
	
	
	//IMPREÇÃO DE VALORES
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
	}
	
	//ABRE GET/SET nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	//FECHA GET/SET nome
	
	//ABRE GET/SET tipo
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	//FECHA GET/SET tipo
	
	//ABRE GET/SET episodios
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	
	public int getEpisodios() {
		return this.episodios;
	}
	
	//FECHA GET/SET episodios
	
	
	
}

package Sobrecargametodos.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	
	
	/*
	 * TRABALHANDO COM CONSTRUTORES
	 * */
	//Sobre carga de metodos
	public Anime(String nome, String tipo, int episodios, String genero) {
		System.out.println("Dentro do construtor");
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}
	
	//Sobre carga de consrutores
	public Anime() {
		
	}
	

	/*
	 * public void init(String nome, String tipo, int episodios) { this.nome = nome;
	 * this.tipo = tipo; this.episodios = episodios; }
	 * 
	 * 
	 * //SOBRE CARGA //// public void init(String nome, String tipo, int episodios,
	 * String genero) { //// this.nome = nome; //// this.tipo = tipo; ////
	 * this.episodios = episodios; //// this.genero = genero; //// } // 
	 * 
	 * public void init(String nome, String tipo, int episodios, String genero) {
	 * this.init(nome, tipo, episodios); this.genero = genero; }
	 **/
	
	
	//IMPREÇÃO DE VALORES
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
	}
	
	//ABRE GET/SET genero
	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//FECHA GET/SET genero

	
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

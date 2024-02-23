package Sobrecargametodos.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private String estudio;
	
	
	/*
	 * TRABALHANDO COM CONSTRUTORES
	 * */
	
	//Sobre carga de metodos
	public Anime(String nome, String tipo, int episodios, String genero) {
		this();//chamando o construtor
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}
	
	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		this(nome, tipo, episodios, genero);//chamando o construtor
		this.setEstudio(estudio);
	}
	
	//Sobre carga de consrutores
	public Anime() {
	//Este serve para chamada e criação de objetos no "main"
		System.out.println("Dentro do consrutor sem argumentos");//não precisa do print
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
		System.out.println(this.estudio);
	}

	//ABRE GET/SET
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/****************************************************************
	 *———————————————————————————————————————————————————————————————
	 * **************************************************************/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	/****************************************************************
	 *———————————————————————————————————————————————————————————————
	 * **************************************************************/
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	/****************************************************************
	 *———————————————————————————————————————————————————————————————
	 * **************************************************************/
	
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	
	public int getEpisodios() {
		return this.episodios;
	}
	
	/****************************************************************
	 *———————————————————————————————————————————————————————————————
	 * **************************************************************/

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
	//FECHA GET/SET
	
	
	
}

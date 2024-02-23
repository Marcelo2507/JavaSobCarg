package Sobrecargametodos.test;

import Sobrecargametodos.dominio.Anime;

public class AnimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciando obj
		Anime anime = new Anime();
		
		anime.setNome("Akudama drive");
		anime.setTipo("TV");
		anime.setEpisodios(12);
		anime.imprime();
	}

}

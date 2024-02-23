package Sobrecargametodos.test;

import Sobrecargametodos.dominio.Anime;

public class AnimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciando obj
		Anime anime = new Anime("DBZ", "PC", 1200, "Ação", "Produtora não sei o nome");
		anime.imprime();
		
		System.out.println("-------------------");

		
//		
//		anime.init("DBZ", "PC", 1200);
//		
//		anime.init("Samurai", "PC", 1200, "Ação");
		
//		anime.setNome("Akudama drive");
//		anime.setTipo("TV");
//		anime.setEpisodios(12);

	}

}

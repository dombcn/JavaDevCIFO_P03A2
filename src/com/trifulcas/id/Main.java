package com.trifulcas.id;

public class Main {

	public static void main(String[] args) {
		System.out.println("Juego Piedra Papel Tijeras");
		Jugador eva = new Jugador("Eva", new Teclado());
        Jugador juan = new Jugador("Juan", new CPU());
        Juego ppt = new Juego(eva, juan, new JuegoPPT());
        System.out.println(ppt.jugar());
       
        System.out.println("\nJuego Piedra Papel Tijeras Lagarto Spock");
		Jugador manel = new Jugador("Manel", new Teclado());
        Jugador miguel = new Jugador("Miguel", new CPU());
        Juego pptls = new Juego(manel, miguel, new JuegoPPTLS(), new Consola());
        System.out.println(pptls.jugar());
	}
	
}

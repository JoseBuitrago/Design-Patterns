package jbuitrago29.Decorator;

public class Main {

public static void  main (String[] args) {
	
	Vendible auto1 = new Fiat500();
	auto1 = new CDPlayer(auto1);
	
	System.out.println("Descripcion: "+auto1.getDescripcion()+ " Precio: "+auto1.getPrecio());
	
	Vendible auto2 = new FordFiesta();
	auto2 = new AireAcondicionado(auto2);
	auto2 = new MP3Player(auto2);
	
	System.out.println("Descripcion: "+auto2.getDescripcion()+ " Precio: "+auto2.getPrecio());
	}
}

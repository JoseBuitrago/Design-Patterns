package jbuitrago29.Decorator;

public class Fiat500 extends Auto {

	public String getDescripcion() {
		return "Fiat500 modelo 2010";
	}
	
	@Override
	public float getPrecio() {
		return 15000;
	}

}

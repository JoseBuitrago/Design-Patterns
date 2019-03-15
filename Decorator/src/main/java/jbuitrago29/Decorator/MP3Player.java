package jbuitrago29.Decorator;

public class MP3Player extends AutoDecorator {

	public MP3Player(Vendible vendible) {
		super(vendible);
		
	}

	@Override
	public String getDescripcion() {
		
		return getVendible().getDescripcion()+" con MP3Player";
	}

	@Override
	public float getPrecio() {
		
		return getVendible().getPrecio()+ 250;
	}

}

package jbuitrago29.Decorator;

public class CDPlayer extends AutoDecorator {

	public CDPlayer(Vendible vendible) {
		super(vendible);
		
	}

	@Override
	public String getDescripcion() {
		
		return getVendible().getDescripcion()+" con CDPalyer";
	}

	@Override
	public float getPrecio() {
		
		return getVendible().getPrecio()+ 100;
	}

}

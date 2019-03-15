package jbuitrago29.Decorator;

public class AireAcondicionado extends AutoDecorator {

	public AireAcondicionado(Vendible vendible) {
		super(vendible);
		
	}

	@Override
	public String getDescripcion() {
		
		return getVendible().getDescripcion()+" con Aire Acondicionado";
	}

	@Override
	public float getPrecio() {
		
		return getVendible().getPrecio() + 1500;
	}

}

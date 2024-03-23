package ejemplo.luis.patrones.disenio.abstractmethod.models;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.BottomGarment;

public class DressPants implements BottomGarment{
	
	private String brand;
	private String style = "Formal wear: Pants";
	
	public DressPants(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return this.brand;
	}

	@Override
	public String style() {
		// TODO Auto-generated method stub
		return this.style;
	}

	@Override
	public String toString() {
		return "DressPants [brand=" + brand + ", style=" + style + "]";
	}

}

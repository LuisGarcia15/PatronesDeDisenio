package ejemplo.luis.patrones.disenio.abstractmethod.models;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.UpperGarment;

public class DressShirt implements UpperGarment{
	
	private String brand;
	private String style = "Formal wear: Shirt";

	public DressShirt(String brand) {
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
		return "DressShirt [brand=" + brand + ", style=" + style + "]";
	}

}

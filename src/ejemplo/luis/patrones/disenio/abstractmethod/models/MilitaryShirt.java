package ejemplo.luis.patrones.disenio.abstractmethod.models;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.UpperGarment;

public class MilitaryShirt implements UpperGarment{
	
	private String brand;
	private String style = "Military: Shirt";

	public MilitaryShirt(String brand) {
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
		return "MilitaryShirt [brand=" + brand + ", style=" + style + "]";
	}

}

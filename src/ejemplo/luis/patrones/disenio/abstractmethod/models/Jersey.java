package ejemplo.luis.patrones.disenio.abstractmethod.models;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.UpperGarment;

public class Jersey implements UpperGarment{
	
	private String brand;
	private String style = "Soccer: Jersey";

	public Jersey(String brand) {
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
		return "Jersey [brand=" + brand + ", style=" + style + "]";
	}

}

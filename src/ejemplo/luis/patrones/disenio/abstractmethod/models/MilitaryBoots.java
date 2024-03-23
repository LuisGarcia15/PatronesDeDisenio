package ejemplo.luis.patrones.disenio.abstractmethod.models;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.Shoes;

public class MilitaryBoots implements Shoes{
	
	private String brand;
	private String style = "Military: Boots";

	public MilitaryBoots(String brand) {
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
		return "MilitaryBoots [brand=" + brand + ", style=" + style + "]";
	}

}

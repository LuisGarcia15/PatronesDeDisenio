package ejemplo.luis.patrones.disenio.abstractmethod.models;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.Shoes;

public class SoccerTennis implements Shoes{
	
	private String brand;
	private String style = "Soccer: Tennis";

	public SoccerTennis(String brand) {
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
		return "SoccerTennis [brand=" + brand + ", style=" + style + "]";
	}

}

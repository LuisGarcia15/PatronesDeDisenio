package ejemplo.luis.patrones.disenio.abstractmethod.models;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.BottomGarment;

public class Short implements BottomGarment{
	
	private String brand;
	private String style = "Soccer: Short";

	public Short(String brand) {
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
		return "Short [brand=" + brand + ", style=" + style + "]";
	}

}

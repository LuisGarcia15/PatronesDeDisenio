package ejemplo.luis.patrones.disenio.abstractmethod.factories;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.BottomGarment;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.Shoes;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.UpperGarment;

public class Configuration{
	
	private AbstractFactory factory;

	public Configuration(AbstractFactory factory) {
		super();
		this.factory = factory;
	}
	
	public UpperGarment createUpperGarment(String brand) {
		return this.factory.createUpperGarment(brand);
	}
	public BottomGarment createBottomGarment(String brand) {
		return this.factory.createBottomGarment(brand);
	}
	public Shoes createShoesGarment(String brand) {
		return this.factory.createShoesGarment(brand);
	}

	public String productsInfo() {
		return this.factory.productsInfo();
	}

}

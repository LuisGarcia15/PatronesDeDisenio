package ejemplo.luis.patrones.disenio.abstractmethod.factories;

import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.BottomGarment;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.Shoes;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.UpperGarment;

public interface AbstractFactory {
	
	public UpperGarment createUpperGarment(String brand);
	public BottomGarment createBottomGarment(String brand);
	public Shoes createShoesGarment(String brand);
	public String productsInfo();
}

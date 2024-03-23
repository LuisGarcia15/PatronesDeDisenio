package ejemplo.luis.patrones.disenio.abstractmethod.factories;

import ejemplo.luis.patrones.disenio.abstractmethod.models.Jersey;
import ejemplo.luis.patrones.disenio.abstractmethod.models.Short;
import ejemplo.luis.patrones.disenio.abstractmethod.models.SoccerTennis;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.BottomGarment;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.Shoes;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.UpperGarment;

public class SoccerClothesFactory implements AbstractFactory{
	
	private UpperGarment upperGarment;
	private BottomGarment bottomGarment;
	private Shoes shoes;

	@Override
	public UpperGarment createUpperGarment(String brand) {
		this.upperGarment = new Jersey(brand);
		return this.upperGarment;
	}

	@Override
	public BottomGarment createBottomGarment(String brand) {
		this.bottomGarment = new Short(brand);
		return this.bottomGarment;
	}

	@Override
	public Shoes createShoesGarment(String brand) {
		this.shoes = new SoccerTennis(brand);
		return this.shoes;
	}
	
	@Override
	public String productsInfo() {
		return "UpperGarment{" + this.upperGarment +"}\n" + "BottomGarment {" + this.bottomGarment +
				"}\n" + "Shoes {" + this.shoes + "}";
	}

}

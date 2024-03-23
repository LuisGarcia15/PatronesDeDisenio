package ejemplo.luis.patrones.disenio.abstractmethod.factories;

import ejemplo.luis.patrones.disenio.abstractmethod.models.DressPants;
import ejemplo.luis.patrones.disenio.abstractmethod.models.DressShirt;
import ejemplo.luis.patrones.disenio.abstractmethod.models.DressShoes;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.BottomGarment;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.Shoes;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.UpperGarment;

public class DressClothesFactory implements AbstractFactory{
	
	private UpperGarment upperGarment;
	private BottomGarment bottomGarment;
	private Shoes shoes;

	@Override
	public UpperGarment createUpperGarment(String brand) {
		this.upperGarment = new DressShirt(brand);
		return this.upperGarment;
	}

	@Override
	public BottomGarment createBottomGarment(String brand) {
		this.bottomGarment = new DressPants(brand);
		return this.bottomGarment;
	}

	@Override
	public Shoes createShoesGarment(String brand) {
		this.shoes = new DressShoes(brand);
		return this.shoes;
	}
	
	@Override
	public String productsInfo() {
		return "UpperGarment{" + this.upperGarment +"}\n" + "BottomGarment {" + this.bottomGarment +
				"}\n" + "Shoes {" + this.shoes + "}";
	}

}

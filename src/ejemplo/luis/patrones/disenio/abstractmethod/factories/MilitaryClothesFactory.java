package ejemplo.luis.patrones.disenio.abstractmethod.factories;

import ejemplo.luis.patrones.disenio.abstractmethod.models.MilitaryBoots;
import ejemplo.luis.patrones.disenio.abstractmethod.models.MilitaryPants;
import ejemplo.luis.patrones.disenio.abstractmethod.models.MilitaryShirt;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.BottomGarment;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.Shoes;
import ejemplo.luis.patrones.disenio.abstractmethod.modelsabstract.UpperGarment;

public class MilitaryClothesFactory implements AbstractFactory{
	
	private UpperGarment upperGarment;
	private BottomGarment bottomGarment;
	private Shoes shoes;

	@Override
	public UpperGarment createUpperGarment(String brand) {
		this.upperGarment = new MilitaryShirt(brand);
		return this.upperGarment;
	}

	@Override
	public BottomGarment createBottomGarment(String brand) {
		this.bottomGarment = new MilitaryPants(brand);
		return bottomGarment;
	}

	@Override
	public Shoes createShoesGarment(String brand) {
		this.shoes = new MilitaryBoots(brand);
		return new MilitaryBoots(brand);
	}
	
	@Override
	public String productsInfo() {
		return "UpperGarment{" + this.upperGarment +"}\n" + "BottomGarment {" + this.bottomGarment +
				"}\n" + "Shoes {" + this.shoes + "}";
	}

}

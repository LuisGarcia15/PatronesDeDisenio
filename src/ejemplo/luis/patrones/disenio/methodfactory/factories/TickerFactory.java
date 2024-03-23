package ejemplo.luis.patrones.disenio.methodfactory.factories;

import ejemplo.luis.patrones.disenio.methodfactory.models.Ticker;
import ejemplo.luis.patrones.disenio.methodfactory.modelsabstract.Enemy;
import ejemplo.luis.patrones.disenio.methodfactory.modelsabstract.GenerycFactory;

public class TickerFactory extends GenerycFactory{

	@Override
	public Enemy createProduct() {
		// TODO Auto-generated method stub
		return new Ticker();
	}

}

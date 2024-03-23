package ejemplo.luis.patrones.disenio.methodfactory.factories;

import ejemplo.luis.patrones.disenio.methodfactory.models.Boo;
import ejemplo.luis.patrones.disenio.methodfactory.modelsabstract.Enemy;
import ejemplo.luis.patrones.disenio.methodfactory.modelsabstract.GenerycFactory;

public class BooFactory extends GenerycFactory{

	@Override
	public Enemy createProduct() {
		// TODO Auto-generated method stub
		return new Boo();
	}

}

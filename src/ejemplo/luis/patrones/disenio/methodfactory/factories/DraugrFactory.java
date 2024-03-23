package ejemplo.luis.patrones.disenio.methodfactory.factories;

import ejemplo.luis.patrones.disenio.methodfactory.models.Draugr;
import ejemplo.luis.patrones.disenio.methodfactory.modelsabstract.Enemy;
import ejemplo.luis.patrones.disenio.methodfactory.modelsabstract.GenerycFactory;

public class DraugrFactory extends GenerycFactory{

	@Override
	public Enemy createProduct() {
		// TODO Auto-generated method stub
		return new Draugr();
	}

}

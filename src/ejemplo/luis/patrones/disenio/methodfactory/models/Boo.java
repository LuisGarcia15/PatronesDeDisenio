package ejemplo.luis.patrones.disenio.methodfactory.models;

import ejemplo.luis.patrones.disenio.methodfactory.modelsabstract.Enemy;

public class Boo implements Enemy{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Wua ja ja ja";
	}

	@Override
	public String videogame() {
		// TODO Auto-generated method stub
		return "Boo[Franchise: Super Mario Bros]";
	}

}

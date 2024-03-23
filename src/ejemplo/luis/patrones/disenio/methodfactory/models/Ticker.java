package ejemplo.luis.patrones.disenio.methodfactory.models;

import ejemplo.luis.patrones.disenio.methodfactory.modelsabstract.Enemy;

public class Ticker implements Enemy{

	@Override
	public String sound() {
		return "tac tac tac tac";
	}

	@Override
	public String videogame() {
		// TODO Auto-generated method stub
		return "Ticker[Franchise: Gears Of War]";
	}

}

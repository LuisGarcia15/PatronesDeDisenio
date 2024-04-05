package ejemplo.luis.patrones.disenio.builder.test;

import ejemplo.luis.patrones.disenio.builder.builders.AtariControlBuilder;
import ejemplo.luis.patrones.disenio.builder.builders.Director;
import ejemplo.luis.patrones.disenio.builder.builders.GamecubeControlBuilder;
import ejemplo.luis.patrones.disenio.builder.builders.NesControlBuilder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		
		System.out.println("******************** Probando Patrón de Diseño Builder ********************\n");
		AtariControlBuilder atariControl = new AtariControlBuilder();
		Director director = new Director(atariControl);
		director.make();
		System.out.println("----- Creando objeto de control Atari -----");
		System.out.println(director.getResult());
		System.out.println("----- Creando objeto de control Nes -----");
		NesControlBuilder nesControl = new NesControlBuilder();
		director.changeBuilder(nesControl);
		director.make();
		System.out.println(director.getResult());
		System.out.println("----- Creando objeto de control Gamecube -----");
		GamecubeControlBuilder gamecubeControl = new GamecubeControlBuilder();
		director.changeBuilder(gamecubeControl);
		director.make();
		System.out.println(director.getResult());
	}
}

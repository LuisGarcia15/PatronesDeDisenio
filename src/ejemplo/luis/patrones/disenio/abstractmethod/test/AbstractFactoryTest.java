package ejemplo.luis.patrones.disenio.abstractmethod.test;

import java.util.Scanner;

import ejemplo.luis.patrones.disenio.abstractmethod.factories.Configuration;
import ejemplo.luis.patrones.disenio.abstractmethod.factories.DressClothesFactory;
import ejemplo.luis.patrones.disenio.abstractmethod.factories.MilitaryClothesFactory;
import ejemplo.luis.patrones.disenio.abstractmethod.factories.SoccerClothesFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		char output = 'S';
		Configuration configuration;
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		String choise;
		
		System.out.println("***** Abstract Factory *****");
		System.out.println("**************************");
		while (output == 'S' || output == 's') {
			System.out.println("Ingresa un número:");
			choise = input.nextLine();
			switch(choise){
			case "1":
				configuration = new Configuration(new DressClothesFactory());
				configuration.createUpperGarment("Armani");
				configuration.createBottomGarment("Ralph Lauren");
				configuration.createShoesGarment("Ralph Lauren");
				System.out.println(configuration.productsInfo());
				System.out.println("**************************");
				break;
			case "2":
				configuration = new Configuration(new MilitaryClothesFactory());
				configuration.createUpperGarment("Mexico");
				configuration.createBottomGarment("Mexico");
				configuration.createShoesGarment("Mexico");
				System.out.println(configuration.productsInfo());
				System.out.println("**************************");
				break;
			case "3":
				configuration = new Configuration(new SoccerClothesFactory());
				configuration.createUpperGarment("Nike");
				configuration.createBottomGarment("Adidas");
				configuration.createShoesGarment("Nike");
				System.out.println(configuration.productsInfo());
				System.out.println("**************************");
				break;
			default:	
				System.out.println("End");
				output = 'N';
			}
		}
	}
}

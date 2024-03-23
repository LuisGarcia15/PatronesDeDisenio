package ejemplo.luis.patrones.disenio.methodfactory.test;

import java.util.Scanner;

import ejemplo.luis.patrones.disenio.methodfactory.factories.BooFactory;
import ejemplo.luis.patrones.disenio.methodfactory.factories.DraugrFactory;
import ejemplo.luis.patrones.disenio.methodfactory.factories.TickerFactory;
import ejemplo.luis.patrones.disenio.methodfactory.models.Boo;
import ejemplo.luis.patrones.disenio.methodfactory.models.Draugr;
import ejemplo.luis.patrones.disenio.methodfactory.models.Ticker;

public class TestMethodFactory {
	public static void main(String[] args) {
		char output = 'S';
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		String choise;
		
		System.out.println("***** Method Factory *****");
		System.out.println("**************************");
		while (output == 'S' || output == 's') {
			System.out.println("Ingresa un número:");
			choise = input.nextLine();
			switch(choise){
			case "1":
				BooFactory booFactory = new BooFactory();
				Boo boo = (Boo) booFactory.createProduct();
				System.out.println(boo.sound());
				System.out.println(boo.videogame());
				System.out.println("**************************");
				break;
			case "2":
				DraugrFactory draugrFactory = new DraugrFactory();
				Draugr draugr = (Draugr) draugrFactory.createProduct();
				System.out.println(draugr.sound());
				System.out.println(draugr.videogame());
				System.out.println("**************************");
				break;
			case "3":
				TickerFactory tickerFactory = new TickerFactory();
				Ticker ticker = (Ticker) tickerFactory.createProduct();
				System.out.println(ticker.sound());
				System.out.println(ticker.videogame());
				System.out.println("**************************");
				break;
			default:	
				System.out.println("End");
				output = 'N';
			}
		}
	}
}

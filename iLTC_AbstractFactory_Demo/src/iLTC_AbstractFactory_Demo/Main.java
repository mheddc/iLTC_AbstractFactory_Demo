package iLTC_AbstractFactory_Demo;

import java.io.IOException;
import java.util.Scanner;

import iLTC_AbstractFactory_Demo_Factories.BurgerMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.ItalianMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.KidsMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.VegetarianMenuFactory;

public class Main {

	static public void main (String args[]) {
		
		showMenu();
		Guest guest=new Guest();
		MenuFactory menuFactory = createFactory();
		Restaurant restaurant = new Restaurant(menuFactory, guest);
		restaurant.serveMenuToGuest();
		
	}

	public static MenuFactory createFactory() {
		
		MenuFactory menuFactory=null;
		int choice;
		
		Scanner scanner = new Scanner(System.in);
		choice=scanner.nextInt();
		
		do {
			switch(choice) {
			case 1:
				menuFactory = new BurgerMenuFactory();
				break;
			case 2:
				menuFactory = new ItalianMenuFactory();
				break;
			case 3:
				menuFactory = new KidsMenuFactory();
				break;
			case 4:
				menuFactory= new VegetarianMenuFactory();
				break;
			default:
				System.out.println("Wrong Input. Repeat.");
			}
		} while(menuFactory==null && choice!=5);
		
		scanner.close();
		
		return menuFactory;	
	}
	
	public static void showMenu() {
		System.out.println("In which restaurant should the guest go? Please select.");
		System.out.println("1-Burger restaurant");
		System.out.println("2-Italian restaurant");
		System.out.println("3-Kids restaurants");
		System.out.println("4-Vegetarian restaurant");
	}


	
}
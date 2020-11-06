package iLTC_AbstractFactory_Demo;

import java.io.IOException;
import java.util.Scanner;

import iLTC_AbstractFactory_Demo_Factories.BurgerMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.ItalianMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.KidsMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.VegetarianMenuFactory;

public class Restaurant {

	static public void main (String args[]) {
		Restaurant restaurant = new Restaurant();
		Guest guest=new Guest();
		
		restaurant.showMenu();
		MenuFactory menuFactory = restaurant.createFactory();
		
		System.out.println(guest.drinkDrink(menuFactory.createDrink()));
		System.out.println(guest.eatMainCourse(menuFactory.createMainCourse()));
		System.out.println(guest.eatSideDish(menuFactory.createSideDish()));
		System.out.println(guest.eatDessert(menuFactory.createDessert()));
		
	}

	public MenuFactory createFactory() {
		
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
	
	public void showMenu() {
		System.out.println("Guest comes into the restaurant and chooses (Select):");
		System.out.println("1-Burger Menu");
		System.out.println("2-Italian Menu");
		System.out.println("3-Kids Menu");
		System.out.println("4-Vegetarian Menu");
	}


	
}
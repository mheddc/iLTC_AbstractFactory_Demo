package iLTC_AbstractFactory_Demo;

import java.util.Scanner;

import iLTC_AbstractFactory_Demo_Factories.BurgerMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.ItalianMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.KidsMenuFactory;
import iLTC_AbstractFactory_Demo_Factories.VegetarianMenuFactory;

public class Restaurant {

	private MenuFactory menuFactory;
	private Guest guest;
	
	public Restaurant(MenuFactory menuFactory, Guest guest) {
		this.menuFactory=menuFactory;
		this.guest=guest;
	}
	
	public void serveMenuToGuest() {
		System.out.println(guest.drinkDrink(menuFactory.createDrink()));
		System.out.println(guest.eatMainCourse(menuFactory.createMainCourse()));
		System.out.println(guest.eatSideDish(menuFactory.createSideDish()));
		System.out.println(guest.eatDessert(menuFactory.createDessert()));
	}
	

}


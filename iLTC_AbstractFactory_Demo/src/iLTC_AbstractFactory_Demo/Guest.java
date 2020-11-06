package iLTC_AbstractFactory_Demo;

import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Drink;
import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;
import iLTC_AbstractFactory_Demo_ProductInterfaces.SideDish;



public class Guest {

		
	public String eatDessert(Dessert dessert) {
		return "Guest eats " + dessert.getDescription() + " and says: " + dessert.eatDessert();
	}
	
	public String eatMainCourse(MainCourse mainCourse) {
		return "Guest eats " + mainCourse.getDescription() + " and says: " + mainCourse.eatMainDish();
	}
	
	public String eatSideDish(SideDish sideDish) {
		return "Guest eats " + sideDish.getDescription() + " and says: " + sideDish.eatSideDish();
	}
	
	public String drinkDrink(Drink drink) {
		return "Guest drinks " + drink.getDescription() + " and says: " + drink.drink();
	}
	
}

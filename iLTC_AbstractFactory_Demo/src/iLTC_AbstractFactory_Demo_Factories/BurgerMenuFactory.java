package iLTC_AbstractFactory_Demo_Factories;

import iLTC_AbstractFactory_Demo.MenuFactory;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Drink;
import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;
import iLTC_AbstractFactory_Demo_ProductInterfaces.SideDish;
import iLTC_AbstractionFactory_Demo_Products.Burger;
import iLTC_AbstractionFactory_Demo_Products.ChocolateCake;
import iLTC_AbstractionFactory_Demo_Products.Coke;
import iLTC_AbstractionFactory_Demo_Products.Fries;

public class BurgerMenuFactory implements MenuFactory{

	@Override
	public Drink createDrink() {
		// TODO Auto-generated method stub
		return new Coke();
	}

	@Override
	public Dessert createDessert() {
		// TODO Auto-generated method stub
		return new ChocolateCake();
	}

	@Override
	public MainCourse createMainCourse() {
		// TODO Auto-generated method stub
		return new Burger();
	}

	@Override
	public SideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Fries();
	}

}

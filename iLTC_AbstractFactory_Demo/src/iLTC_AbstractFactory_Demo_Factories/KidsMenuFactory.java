package iLTC_AbstractFactory_Demo_Factories;

import iLTC_AbstractFactory_Demo.MenuFactory;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Drink;
import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;
import iLTC_AbstractFactory_Demo_ProductInterfaces.SideDish;
import iLTC_AbstractionFactory_Demo_Products.ChocolateIceCream;
import iLTC_AbstractionFactory_Demo_Products.Coke;
import iLTC_AbstractionFactory_Demo_Products.Fries;
import iLTC_AbstractionFactory_Demo_Products.Pizza;

public class KidsMenuFactory implements MenuFactory{

	@Override
	public Drink createDrink() {
		// TODO Auto-generated method stub
		return new Coke();
	}

	@Override
	public Dessert createDessert() {
		// TODO Auto-generated method stub
		return new ChocolateIceCream();
	}

	@Override
	public MainCourse createMainCourse() {
		// TODO Auto-generated method stub
		return new Pizza();
	}

	@Override
	public SideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Fries();
	}

}

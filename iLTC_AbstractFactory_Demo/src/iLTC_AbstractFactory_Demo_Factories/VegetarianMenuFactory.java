package iLTC_AbstractFactory_Demo_Factories;

import iLTC_AbstractFactory_Demo.MenuFactory;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Drink;
import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;
import iLTC_AbstractionFactory_Demo_Products.Apple;
import iLTC_AbstractionFactory_Demo_Products.Lentils;
import iLTC_AbstractionFactory_Demo_Products.MatchaTea;
import iLTC_AbstractionFactory_Demo_Products.Salad;
import iLTC_AbstractFactory_Demo_ProductInterfaces.SideDish;

public class VegetarianMenuFactory implements MenuFactory{

	@Override
	public Drink createDrink() {
		// TODO Auto-generated method stub
		return new MatchaTea();
	}


	@Override
	public Dessert createDessert() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public MainCourse createMainCourse() {
		// TODO Auto-generated method stub
		return new Lentils();
	}


	@Override
	public SideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Salad();
	}

}

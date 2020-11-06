package iLTC_AbstractFactory_Demo_Factories;

import iLTC_AbstractFactory_Demo.MenuFactory;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;
import iLTC_AbstractFactory_Demo_ProductInterfaces.Drink;
import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;
import iLTC_AbstractFactory_Demo_ProductInterfaces.SideDish;
import iLTC_AbstractionFactory_Demo_Products.Bruschetta;
import iLTC_AbstractionFactory_Demo_Products.Espresso;
import iLTC_AbstractionFactory_Demo_Products.Pasta;
import iLTC_AbstractionFactory_Demo_Products.Tiramisu;

public class ItalianMenuFactory implements MenuFactory{

	@Override
	public Drink createDrink() {
		// TODO Auto-generated method stub
		return new Espresso();
	}

	@Override
	public Dessert createDessert() {
		// TODO Auto-generated method stub
		return new Tiramisu();
	}

	@Override
	public MainCourse createMainCourse() {
		// TODO Auto-generated method stub
		return new Pasta();
	}

	@Override
	public SideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Bruschetta();
	}

}

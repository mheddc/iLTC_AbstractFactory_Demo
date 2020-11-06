package iLTC_AbstractFactory_Demo;

import iLTC_AbstractFactory_Demo_ProductInterfaces.*;

public interface MenuFactory {

	public Drink createDrink();
	public Dessert createDessert();
	public MainCourse createMainCourse();
	public SideDish createSideDish();
	
}

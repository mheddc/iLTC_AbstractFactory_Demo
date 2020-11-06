package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.Drink;

public class Espresso implements Drink{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Espresso";
	}

	@Override
	public String drink() {
		// TODO Auto-generated method stub
		return "That's a lot of caffeine";
	}

}

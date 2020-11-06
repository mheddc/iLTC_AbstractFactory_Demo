package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.Drink;

public class Coke implements Drink{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	@Override
	public String drink() {
		// TODO Auto-generated method stub
		return "Ahhhh, that was refreshing";
	}

}

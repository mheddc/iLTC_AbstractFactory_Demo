package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;

public class Apple implements Dessert{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Apple";
	}

	@Override
	public String eatDessert() {
		// TODO Auto-generated method stub
		return "Apple. Nothing special.";
	}

}

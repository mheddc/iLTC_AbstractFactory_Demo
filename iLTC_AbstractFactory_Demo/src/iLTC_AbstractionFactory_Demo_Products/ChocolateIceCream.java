package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;

public class ChocolateIceCream implements Dessert{

	@Override
	public String eatDessert() {
		// TODO Auto-generated method stub
		return "Chocolate. Sweet.";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Chocolate Ice Cream";
	}

}

package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;

public class ChocolateCake implements Dessert{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Chocolate Cake";
	}

	@Override
	public String eatDessert() {
		// TODO Auto-generated method stub
		return "The cake is delicious!";
	}

}

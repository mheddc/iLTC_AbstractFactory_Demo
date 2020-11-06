package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.Dessert;

public class Tiramisu implements Dessert {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Tiramisu";
	}

	@Override
	public String eatDessert() {
		// TODO Auto-generated method stub
		return "I can taste the Marsala Wine in there.";
	}

}

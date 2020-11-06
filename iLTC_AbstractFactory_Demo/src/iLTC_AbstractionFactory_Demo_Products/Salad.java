package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.SideDish;

public class Salad implements SideDish{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Salad";
	}

	@Override
	public String eatSideDish() {
		// TODO Auto-generated method stub
		return "No dressing:(";
	}

}

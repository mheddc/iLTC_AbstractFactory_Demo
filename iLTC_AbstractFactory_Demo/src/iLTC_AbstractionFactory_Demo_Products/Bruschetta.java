package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.SideDish;

public class Bruschetta implements SideDish{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Bruschetta";
	}

	@Override
	public String eatSideDish() {
		// TODO Auto-generated method stub
		return "Some Calories.";
	}

}

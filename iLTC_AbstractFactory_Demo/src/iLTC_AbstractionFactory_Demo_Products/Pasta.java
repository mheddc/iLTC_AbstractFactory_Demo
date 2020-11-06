package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;

public class Pasta implements MainCourse {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Pasta";
	}

	@Override
	public String eatMainDish() {
		// TODO Auto-generated method stub
		return "Very Italian.";
	}

}

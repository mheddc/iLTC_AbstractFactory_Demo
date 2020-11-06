package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;

public class Burger implements MainCourse {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Burger";
	}

	@Override
	public String eatMainDish() {
		// TODO Auto-generated method stub
		return "Not the most healthy meal.";
	}

}

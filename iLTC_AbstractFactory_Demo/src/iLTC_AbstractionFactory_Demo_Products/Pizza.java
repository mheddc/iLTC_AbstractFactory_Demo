package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;

public class Pizza implements MainCourse {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Small Pizza for Kids";
	}

	@Override
	public String eatMainDish() {
		// TODO Auto-generated method stub
		return "Pizza is tasty.";
	}

}

package iLTC_AbstractionFactory_Demo_Products;

import iLTC_AbstractFactory_Demo_ProductInterfaces.MainCourse;

public class Lentils implements MainCourse{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Lentils";
	}

	@Override
	public String eatMainDish() {
		// TODO Auto-generated method stub
		return "Boring but healthy";
	}

}

abstract class Car
{
	String car_brand,series,color,car_type,fule;
	int sits;
	float size,range,price;
	boolean automatic;
	abstract void describe();
	void finalProduct()
	{
		System.out.println("\n\nThis is all details of " + car_brand + "'s Car\n");
		System.out.println("Car Brand:" + car_brand);
		System.out.println("Car Series:" + series);
		System.out.println("Car Color:" + color);
		System.out.println("Car Type:" + car_type);
		System.out.println("Car Fule:" + fule);
		System.out.println("Car size:" + size);
		System.out.println("Avaiable sits in car :" + sits);
		System.out.println("Car Range:" + range);
		System.out.println("Is car automatically?:" + automatic);
		System.out.println("Car Price:" + price);
	}
}
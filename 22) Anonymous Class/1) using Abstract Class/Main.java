import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Car car = new Car()
		{
			void describe()
			{
				Scanner sc = new Scanner(System.in);
			
				System.out.println("Please enter car Details");

				System.out.print("Car Brand:");
				car_brand = sc.nextLine();

				System.out.print("Car Series:");
				series = sc.nextLine();

				System.out.print("Car Color:");
				color = sc.nextLine();

				System.out.print("Car Type:");
				car_type = sc.nextLine();

				System.out.print("Car Fule:");
				fule = sc.nextLine();

				System.out.print("Car size:");
				size = sc.nextFloat();
				
				System.out.print("Avaiable sits in car :");
				sits = sc.nextInt();

				System.out.print("Car Range:");
				range = sc.nextFloat();

				System.out.print("Is car automatically?:");
				automatic = sc.nextBoolean();

				System.out.print("Car Price:");
				price = sc.nextFloat();
			}
		};
		car.describe();
		car.finalProduct();
	}
}
import java.util.Scanner;

public class MainClass1 {
	public static void main(String[] args) {
		Car carList[] = new Car[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < carList.length; i++) {
			System.out.println("Car Name: ");
			carList[i] = new Car();
			carList[i].setCarName(scan.next());
			System.out.println("Manufacturer:");
			carList[i].setManufacturer(scan.next());
			System.out.println("registration number:");
			carList[i].setCarRegNumber(scan.next());
			System.out.println("Build Year:");
			carList[i].setYearOfBuild(scan.nextInt());
			System.out.println("Mileage:");
			carList[i].setMileage(scan.nextDouble());
			System.out.println("Is automatic brake system enabled");
			carList[i].setABSEnabled(scan.nextBoolean());
		}
		CarManager manager = new CarManager(carList);
		manager.printAllAvailableCars();
	}
}

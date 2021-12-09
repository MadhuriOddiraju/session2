import java.util.Arrays;

public class CarManager {
	private Car[] carList = new Car[5];

	public CarManager(Car[] carList) {

		this.carList = carList;
	}

	public Car[] getCarList() {
		return this.carList;
	}

	public void printAllAvailableCars() {
		if (this.carList.length == 0) {
			System.out.println("No data available");
			return;
		}
		for (Car car : this.carList) {
			System.out.println(car);
		}
	}
}

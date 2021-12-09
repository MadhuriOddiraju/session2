public class Car {
	private String carName;
	private String manufacturer;
	private String CarRegNumber;
	private int yearOfBuild;
	private double mileage;
	private boolean isABSEnabled;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCarRegNumber() {
		return CarRegNumber;
	}

	public void setCarRegNumber(String carRegNumber) {
		CarRegNumber = carRegNumber;
	}

	public int getYearOfBuild() {
		return yearOfBuild;
	}

	public void setYearOfBuild(int yearOfBuild) {
		this.yearOfBuild = yearOfBuild;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public boolean isABSEnabled() {
		return isABSEnabled;
	}

	public void setABSEnabled(boolean isABSEnabled) {
		this.isABSEnabled = isABSEnabled;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", manufacturer=" + manufacturer + ", CarRegNumber=" + CarRegNumber
				+ ", yearOfBuild=" + yearOfBuild + ", mileage=" + mileage + ", isABSEnabled=" + isABSEnabled + "]";
	}

}

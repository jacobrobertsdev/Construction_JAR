
public class Mall extends Business {

	// Instance fields
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	// Constructors
	public Mall() {
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	} // End of empty-argument constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
		
	} // End of preferred constructor

	
	// Getters and Setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	// End of Getters and Setters
	
	public void Draw() {
		System.out.println("Drawing code for mall");
	} // End of Draw

	
	public String displayData() {
		StringBuilder data = new StringBuilder(super.displayData());
		data.append("Rented Units: " + getNumRentedUnits() + "\n");
		data.append("Median Unit Size: " + getMedianUnitSize() + "\n");
		data.append("Parking Spaces: " + getNumParkingSpaces() + "\n");
		
		return data.toString();
	} // End of displayData

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}
	
	
	
}

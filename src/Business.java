
public class Business extends Building {

	// Instance fields
	protected int numRentableUnits;
	
	// Constructors
	public Business() {
		super();
		this.numRentableUnits = 0;
		
	} // End of empty-argument constructor
	
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	} // End of preferred constructor
	

	// Getters and Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}


	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	// End of Getters and Setters

	public void Draw() {
		System.out.println("Drawing code for business");
	} // End of Draw

	
	public String displayData() {
		StringBuilder data = new StringBuilder(super.displayData());
		data.append("Rentable Units: " + getNumRentableUnits() + "\n");
		
		return data.toString();
	} // End of displayData

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
	
	
	
	
}

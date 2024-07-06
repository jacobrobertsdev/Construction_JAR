
public class SingleFamilyHome extends Residential {
	
	// Instance Fields
	private boolean garage;
	
	// Constructors
	public SingleFamilyHome() {
		super();
		this.garage = false;
	} // End of empty-argument constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	} // End of preferred constructor

	
	// Getters and Setters
	public boolean hasGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	// End of Getters and Setters
	
	public void Draw() {
		System.out.println("Drawing code for single family home");
	} // End of Draw

	
	public String displayData() {
		StringBuilder data = new StringBuilder(super.displayData());
		data.append("Garage: " + hasGarage() + "\n");
		
		return data.toString();
	} // End of displayData

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
	

}

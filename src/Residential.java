
public class Residential extends Building {

	// Instance fields
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	// Constructors
	public Residential() {
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	} // End of empty-argument constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	} // End of preferred constructor
	
	
	// Getters and Setters
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean hasLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	// End of Getters and Setters
	
	public String displayData() {
		StringBuilder data = new StringBuilder(super.displayData());
		data.append("Bedrooms: " + getNumBedrooms() + "\n");
		data.append("Bathrooms: " + getNumBathrooms() + "\n");
		data.append("Laundry Room: " + hasLaundryRoom() + "\n");
		
		return data.toString();
	} // End of displayData

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}
	
	
	
	
}

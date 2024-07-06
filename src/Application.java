
public class Application {

	public static void main(String[] args) {
		
//==============================================
//********** Tests for Building Class **********
//==============================================
		
		System.out.println("Begin tests for Building Class");
		System.out.println();
		
		// Create Building object
		Building building1 = new Building("Test project", "123 Street", 500.00, "Assembly", "A-1");
		
		// Test toString() (implicit call)
		System.out.println(building1);
		System.out.println();

		// Test Getters & Setters
		// Project Name
		building1.setProjectName("New project name");
		System.out.println(building1.getProjectName());
		System.out.println();

		// Address
		building1.setCompleteAddress("New address");
		System.out.println(building1.getCompleteAddress());
		System.out.println();

		// Square feet
		building1.setTotalSquareFeet(100.00);
		System.out.println(building1.getTotalSquareFeet());
		System.out.println();

		// Occupancy Group
		building1.setOccupancyGroup("New occupancy group");
		System.out.println(building1.getOccupancyGroup());
		System.out.println();

		// Subgroup
		building1.setSubgroup("New subgroup");
		System.out.println(building1.getSubgroup());
		System.out.println();
		// End Getters & Setters tests
		
		// Test Draw
		building1.Draw();
		System.out.println();

		// Test displayData
		System.out.println(building1.displayData());
		
		System.out.println("End tests for Building Class");
		System.out.println();

//=====================================================
//********** End of Tests for Building Class **********
//=====================================================
		
//==============================================
//********** Tests for Business Class **********
//==============================================
		
		System.out.println("Begin tests for Business Class");
		System.out.println();
		
		// Create Business object
		Business business1 = new Business("Test project", "123 Street", 500.00, "Assembly", "A-1", 30);
		
		// Test toString() (implicit call)
		System.out.println(business1);
		System.out.println();
		
		// Test Getters & Setters
		// Rentable Units
		business1.setNumRentableUnits(100);
		System.out.println(business1.getNumRentableUnits());
		System.out.println();
		// End Getters & Setters tests
		
		// Test Draw
		business1.Draw();
		System.out.println();
		
		// Test displayData
		System.out.println(business1.displayData());
		
		System.out.println("End tests for Business Class");
		System.out.println();
		
//=====================================================
//********** End of Tests for Business Class **********
//=====================================================
		
		
//=================================================
//********** Tests for Residential Class **********
//=================================================
		
		System.out.println("Begin tests for Residential Class");
		System.out.println();

		// Create Residential object
		Residential residential1 = new Residential("Test project", "123 Street", 500.00, "Assembly", "A-1", 3, 2, true);
				
		// Test toString() (implicit call)
		System.out.println(residential1);
		System.out.println();
				
		// Test Getters & Setters
		// Bedrooms
		residential1.setNumBedrooms(5);
		System.out.println(residential1.getNumBedrooms());
		System.out.println();
				
		// Bathrooms
		residential1.setNumBathrooms(1);
		System.out.println(residential1.getNumBathrooms());
		System.out.println();
				
		// Laundry Room
		residential1.setLaundryRoom(false);
		System.out.println(residential1.hasLaundryRoom());
		System.out.println();
		// End Getters & Setters tests
				
		// Test Draw
		residential1.Draw();
		System.out.println();
				
		// Test displayData
		System.out.println(residential1.displayData());
		
		System.out.println("End tests for Residential Class");
		System.out.println();
		
//=====================================================
//********** End Tests for Residential Class **********
//=====================================================
		
	}

}

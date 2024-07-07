
public class Application {

	public static void main(String[] args) {
		
//==============================================
//********** Tests for Building Class **********
//==============================================
		System.out.println("==============================");
		System.out.println("Begin tests for Building Class");
		System.out.println("==============================");
		System.out.println();
		
		// Create Building object
		Building building1 = new Building("Test project", "123 Street", 500.00, "Assembly", "A-1");
		
		// Test toString() (implicit call)
		System.out.println(building1);
		System.out.println();

		// Test Getters & Setters
		// Project Name
		building1.setProjectName("Test Project Name");
		System.out.println("Updated project name: " + building1.getProjectName());
		System.out.println();

		// Address
		building1.setCompleteAddress("123 Test Street");
		System.out.println("Updated address: " + building1.getCompleteAddress());
		System.out.println();

		// Square feet
		building1.setTotalSquareFeet(100.00);
		System.out.println("Updated square feet: " + building1.getTotalSquareFeet());
		System.out.println();

		// Occupancy Group
		building1.setOccupancyGroup("Test occupancy group");
		System.out.println("Updated occupancy group: " + building1.getOccupancyGroup());
		System.out.println();

		// Subgroup
		building1.setSubgroup("Test Subgroup");
		System.out.println("Updated subgroup: " + building1.getSubgroup());
		System.out.println();
		// End Getters & Setters tests
		
		// Test Draw
		building1.Draw();
		System.out.println();

		// Test displayData
		System.out.println(building1.displayData());
		
		System.out.println("===============================");
		System.out.println("End of tests for Building Class");
		System.out.println("===============================");
		System.out.println();

//=====================================================
//********** End of Tests for Building Class **********
//=====================================================
		
//==============================================
//********** Tests for Business Class **********
//==============================================
		
		System.out.println("==============================");
		System.out.println("Begin tests for Business Class");
		System.out.println("==============================");
		System.out.println();
		
		// Create Business object
		Business business1 = new Business("Test project", "123 Street", 500.00, "Assembly", "A-1", 30);
		
		// Test toString() (implicit call)
		System.out.println(business1);
		System.out.println();
		
		// Test Getters & Setters
		// Rentable Units
		business1.setNumRentableUnits(100);
		System.out.println("Updated rentable units: " + business1.getNumRentableUnits());
		System.out.println();
		// End Getters & Setters tests
		
		// Test Draw
		business1.Draw();
		System.out.println();
		
		// Test displayData
		System.out.println(business1.displayData());
		
		System.out.println("===============================");
		System.out.println("End of tests for Business Class");
		System.out.println("===============================");
		System.out.println();
		
//=====================================================
//********** End of Tests for Business Class **********
//=====================================================
		
		
//=================================================
//********** Tests for Residential Class **********
//=================================================
		
		System.out.println("=================================");
		System.out.println("Begin tests for Residential Class");
		System.out.println("=================================");
		System.out.println();

		// Create Residential object
		Residential residential1 = new Residential("Test project", "123 Street", 500.00, "Assembly", "A-1", 3, 2, true);
				
		// Test toString() (implicit call)
		System.out.println(residential1);
		System.out.println();
				
		// Test Getters & Setters
		// Bedrooms
		residential1.setNumBedrooms(5);
		System.out.println("Updated bedroom count: " + residential1.getNumBedrooms());
		System.out.println();
				
		// Bathrooms
		residential1.setNumBathrooms(1);
		System.out.println("Updated bathroom count: " + residential1.getNumBathrooms());
		System.out.println();
				
		// Laundry Room
		residential1.setLaundryRoom(false);
		System.out.println("Updated has laundry room: " + residential1.hasLaundryRoom());
		System.out.println();
		// End Getters & Setters tests
				
		// Test Draw
		residential1.Draw();
		System.out.println();
				
		// Test displayData
		System.out.println(residential1.displayData());
		
		System.out.println("==================================");
		System.out.println("End of tests for Residential Class");
		System.out.println("==================================");
		System.out.println();
		
//========================================================
//********** End of Tests for Residential Class **********
//========================================================
		
//==========================================
//********** Tests for Mall Class **********
//==========================================
		
		System.out.println("==========================");
		System.out.println("Begin tests for Mall Class");
		System.out.println("==========================");
		System.out.println();
		
		// Create Mall object
		Mall mall1 = new Mall("Test project", "123 Street", 500.00, "Assembly", "A-1", 30, 20, 1200.00, 40);
						
		// Test toString() (implicit call)
		System.out.println(mall1);
		System.out.println();
						
		// Test Getters & Setters
		// Rented Units
		mall1.setNumRentedUnits(10);;
		System.out.println("Updated rented units: " + mall1.getNumRentedUnits());
		System.out.println();
						
		// Median Unit Size
		mall1.setMedianUnitSize(900.00);;
		System.out.println("Updated unit size: " + mall1.getMedianUnitSize());
		System.out.println();
						
		// Parking Spaces
		mall1.setNumParkingSpaces(25);;
		System.out.println("Updated parking spaces: " + mall1.getNumParkingSpaces());
		System.out.println();
		// End Getters & Setters tests
						
		// Test Draw
		mall1.Draw();
		System.out.println();
						
		// Test displayData
		System.out.println(mall1.displayData());
		
		System.out.println("===========================");
		System.out.println("End of tests for Mall Class");
		System.out.println("===========================");
		System.out.println();
		
//=================================================
//********** End of Tests for Mall Class **********
//=================================================
		
//===============================================
//********** Tests for Apartment Class **********
//===============================================
		
		System.out.println("===============================");
		System.out.println("Begin tests for Apartment Class");
		System.out.println("===============================");
		System.out.println();

		// Create Apartment object
		Apartment apartment1 = new Apartment("Test project", "123 Street", 500.00, "Assembly", "A-1", 3, 2, true, 35, 800.00, false);
						
		// Test toString() (implicit call)
		System.out.println(apartment1);
		System.out.println();
						
		// Test Getters & Setters
		// Rentable Units
		apartment1.setNumRentableUnits(42);
		System.out.println("Updated rentable units: " + apartment1.getNumRentableUnits());
		System.out.println();
						
		// Average Unit Size
		apartment1.setAvgUnitSize(750.00);;
		System.out.println("Updated average unit size: " + apartment1.getAvgUnitSize());
		System.out.println();
						
		// Parking
		apartment1.setParkingAvailable(true);;
		System.out.println("Updated has parking: " + apartment1.isParkingAvailable());
		System.out.println();
		// End Getters & Setters tests
						
		// Test Draw
		apartment1.Draw();
		System.out.println();
						
		// Test displayData
		System.out.println(apartment1.displayData());
		
		System.out.println("================================");
		System.out.println("End of tests for Apartment Class");
		System.out.println("================================");
		System.out.println();
				
//======================================================
//********** End of Tests for Apartment Class **********
//======================================================
		
//======================================================
//********** Tests for SingleFamilyHome Class **********
//======================================================
		
		System.out.println("======================================");
		System.out.println("Begin tests for SingleFamilyHome Class");
		System.out.println("======================================");
		System.out.println();

		// Create SingleFamilyHome object
		SingleFamilyHome home1 = new SingleFamilyHome("Test project", "123 Street", 500.00, "Assembly", "A-1", 3, 2, true, false);
						
		// Test toString() (implicit call)
		System.out.println(home1);
		System.out.println();
						
		// Test Getters & Setters
		// Garage
		home1.setGarage(true);;
		System.out.println("Updated has garage: " + home1.hasGarage());
		System.out.println();
		// End Getters & Setters tests
						
		// Test Draw
		home1.Draw();
		System.out.println();
						
		// Test displayData
		System.out.println(home1.displayData());
		
		System.out.println("=======================================");
		System.out.println("End of tests for SingleFamilyHome Class");
		System.out.println("=======================================");
		System.out.println();
				
//=============================================================
//********** End of Tests for SingleFamilyHome Class **********
//=============================================================
		
	}

}

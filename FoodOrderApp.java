
public class FoodOrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DATA Layer (order)
		String clientName = "John Doe";
		String clientAddress = "NY, 88, Empty Street";
		
		int orderId = 1234567890; 
		
		//1st dish
		final String food_1_name = "Pizza Quattro Stagioni";
		float food_1_price = 75.00f; //double
		byte food_1_quantity = 2;
		
		// 2nd dish
		final String food_2_name = "Soup";
		float food_2_price = 25.50f; //double
		byte food_2_quantity = 1;
		
		// 3 drink
		final String drink_3_name = "Wine";
		float drink_3_price = 500.00f; //double
		byte drink_3_quantity = 1;
		
		
		// Calculations / Logic Layer 
		
		
		float food_1_total = food_1_quantity * food_1_price; 
		float food_2_total = food_2_quantity * food_2_price;
		float drink_1_total = drink_3_quantity * drink_3_price;
		
		float total = food_1_total + food_2_total + drink_1_total;
		
		
		// TEMPLATE / OUTPUT LAYER 
		
		System.out.println("############### ORDER No.(" + orderId + ")######");
		System.out.println("- - - - - - - for Mr. " + clientName + " - - - - - -  " );
		
		// 1. "Pizza" x 2 = 150.00MDL
		
		//System.out.println("1. \""+ food_1_name + "\" x " + food_1_quantity + " = " + food_1_total + "MDL");
		//System.out.println("2. \"" + food_2_name + "\" x " + food_2_quantity + " = " + food_2_total + "MDL");
		//System.out.println("3. \"" + drink_3_name + "\" x " + drink_3_quantity + " = " + drink_1_total + "MDL");
		
		//String "\code, \symbol" - escaping ! ! ! !
				
		System.out.printf("1. \"%23s\" x %3d =\n",food_1_name, food_1_quantity);
		System.out.printf("2. \"%23s\" x %3d =\n",food_2_name, food_2_quantity);
		System.out.printf("3. \"%23s\" x %3d =\n",drink_3_name, drink_3_quantity);
		
		System.out.println("-------------------------------------------");
		
		
		System.out.println("Your total amount due = " + total + "MDL");
		
		System.out.println("###########################################" );
		
		
		//HW1: byte, short, int, long -? find min/max value, interval
		//HW2: why are we getting an error if we add the 11th number to it?
		//HW. print() & println() - what is the difference? 
	
		
	
		//HW1. Primitive data types: 
			////Byte:stores whole numbers -128 to 127 (size: 1 byte)
			//Short: stores whole numbers -32,768 to 32,767 (size: 2 bytes)
			////Int: Stores whole numbers from -2,147,483,648 to 2,147,483,647 (size: 4 bytes)
			//Long: Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (size: 8 bytes)
			//Float: Stores fractional numbers (6 to 7 decimal digits)
			//Double: Stores fractional numbers (6 to 7 decimal digits)
		
		//HW2. Answer: if we add another digit at the end next to 0, the int whole number becomes out of range
        //2,147,483,647 < 12,345,678,909
		
		//HW3. 
		// Difference between print() & println()
        //In print() the output will be shown on the same line
        //In println() - the output will be shown on the next line

		
		
		
		
	}

}

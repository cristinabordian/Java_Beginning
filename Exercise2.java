
public class Exercise2 {

	public static void main(String[] args) {
		
		int distanceBetweenCitiesMiles = 200;
		int speedPerHour = 160; 
		
		float distanceBetweenCitiesKmConverted = distanceBetweenCitiesMiles * 1.609f;
		
		float tripDuration = distanceBetweenCitiesKmConverted / speedPerHour; 
		
       //System.out.println(distanceBetweenCitiesKmConverted); 
       System.out.print("The road takes " + tripDuration + " 0 min");
		
		
	}

}

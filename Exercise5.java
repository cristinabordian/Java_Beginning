
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Given code Version A
		
		//int result = (int)1.999999f;
		 //System.out.println(result);
		 
		 // Given code Version B
		
		int result = (int)1.99999999f;
		 System.out.println(result);
		
		
		 
		 // In Version A, why the console is showing 1
		 // Answer: we are indicating the machine to convert result into an int data type
		 //In Version B, why the console is showing 2
		 
		 // Asta-i tricky! 
		 //Daca scoatem f-ul dea la sfarsit, consala afiseaza 1
		 // Teoretic  typecasting elimina tot ce este dupa virgula, nu face rotunjiri.
		 //Este din cauza ca dupa virgula avem 8 decimale dupa virgula, si float-ul poate avea pana la 7? M-am gandit mult la asta. 
		 
		 //Ok yeah, the explanation is sort of a little long-winded but the literal value (i.e., 1.99999999f) is a floating point number.  Inside Java it's not literally stored as one followed by eight (or however many) nines.  The stored value is an approximation of 1.999999999 stored in IEEE 754 floating point format -- a binary exponent and mantissa.  The specifics of that format are complicated and probably not super relevant to the question.  But I think the answer is that since 1.9999999999 is just an approximation, AND since "float" is relatively low precision, that approximation is actually stored as "2" in the floating point variable.  So when you convert it to an int, it's still a 2.
		 //The first version is less precise and a float can store that level of precision, so when that number gets truncated it's 1 -- because the float version is stored as less than 2.
		 //If you changed 1.999999999f to 1.99999999d you might get both of the conversions to be 1, since a double is usually 64-bit (higher precision) and a float is only 32-bit.
		 
		 //Credit for answer: Dr. Cort Tompkins, CTO :D

		 
		
		
	}

}

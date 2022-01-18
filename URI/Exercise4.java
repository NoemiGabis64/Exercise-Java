/**The formula to calculate the area of a circumference is defined as A = π . R2. Considering to this problem that π = 3.14159:
Calculate the area using the formula given in the problem description. */
package URI;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try (Scanner input = new Scanner (System.in)) {
			double A = 0;
			double n = 3.14159;
			double R = 0;
			
			R = input.nextDouble();
			
			A = (n *(R * R));
			
			System.out.printf("A=%.4f\n",A);
		}
		
	}

}

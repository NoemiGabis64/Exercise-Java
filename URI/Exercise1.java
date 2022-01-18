/**Read two floating points' values of double precision A and B, corresponding to two student's grades. 
 * After this, calculate the student's average, considering that grade A has weight 3.5 and B has weight 7.5. 
 * Each grade can be from zero to ten, always with one digit after the decimal point. 
 * Don’t forget to print the end of line after the result, otherwise you will receive “Presentation Error”. 
 * Don’t forget the space before and after the equal sign. */

package URI;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
	    try (Scanner input = new Scanner(System.in)) {
			
			double A = 0;
			double B = 0;
			double M = 0;

			A = input.nextDouble();
			B = input.nextDouble();

			M = ((A*3.5) + (B*7.5))/11;

			System.out.printf("MEDIA = %.5f\n",M);
		}
 
        }
 }
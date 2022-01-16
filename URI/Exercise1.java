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
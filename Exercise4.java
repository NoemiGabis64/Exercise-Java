import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		double A = 0;
		double n = 3.14159;
		double R = 0;
		
		R = input.nextDouble();
		
		A = (n *(R * R));
		
		System.out.printf("A=%.4f\n",A);
		
	}

}

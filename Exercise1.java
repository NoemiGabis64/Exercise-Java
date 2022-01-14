import java.util.Locale;
import java.util.Scanner;

public class Exercise1{
    
	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double A = 0;
		double B = 0;
		double Media = 0;

		A = input.nextDouble();

		B = input.nextDouble();

		Media = ((A*3.5) + (B*7.5))/11.0;

		System.out.printf("MEDIA=%.5f\n",Media);
	}
}
package URI;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); 
		
		double Manufacturing_Cost = 0;
		double Percentage_Distributed = 0;
		double Tax = 0;
		double Vehicle = 20.000;
		
		
		Manufacturing_Cost = ((Percentage_Distributed*0.35)   + (Tax*0.57));
		
		Vehicle = Vehicle + Manufacturing_Cost;
		
		System.out.println("The Manufacturing Cost is:" + Manufacturing_Cost);
		System.out.println("The Percentage Distributed is:" + Percentage_Distributed);
		System.out.println("The Tax is:" + Tax);
		
	}

}
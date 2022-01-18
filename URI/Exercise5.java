/**Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. 
 * Consider that each grade can go from 0 to 10.0, always with one decimal place. */

package URI;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        try (Scanner input = new Scanner(System.in)) {

            double A = 0;
            double B = 0;
            double C = 0;
            double MEDIA = 0; 

            A = input.nextDouble();
            B = input.nextDouble();
            C = input.nextDouble();

            MEDIA = ((A*2) + (B*3) + (C*5))/10;

            System.out.printf("MEDIA = %.1f\n", MEDIA);
        }
    }
    
}

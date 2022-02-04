/**Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money). 
 * Considering that this seller receives 15% over all products sold, 
 * write the final salary (total) of this seller at the end of the month, with two decimal places. */
package URI;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);

        try (Scanner scan = new Scanner (System.in)) {
        String name;
        double salary = 0;
        double salestotal = 0;
        double total = 0;

        name = scan.nextLine();
        salary = scan.nextDouble();
        salestotal = scan.nextDouble();

        total = ((salestotal * 0.15) + salary);

        System.out.printf("TOTAL= %.2f\n", total);
        
    }

    }
} 
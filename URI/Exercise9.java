/**In this problem, the task is to read a code of a product 1,
 *  the number of units of product 1, the price for one unit of 
 * product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. 
 * After this, calculate and show the amount to be paid. */

package URI;

import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        try (Scanner scan = new Scanner(System.in)) {
            int product1 = 0;
            int units1 = 0;
            double price1 = 0;

            int product2 = 0;
            int units2 = 0;
            double price2 = 0;

            double value = 0; 

            System.out.println("PRODUTO 1:");

            product1 = scan.nextInt();
            units1  = scan.nextInt();
            price1 = scan.nextDouble();

            System.out.println("PRODUTO 2:");

            product2 = scan.nextInt();
            units2 = scan.nextInt();
            price2 = scan.nextDouble();

            value = ((price1 * units1) + (price2 * units2));

            System.out.printf("VALOR A PAGAR: R$ %.2f\n", value);
        }
    }
}

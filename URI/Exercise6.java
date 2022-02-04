/**Read four integer values named A, B, C and D. 
 * Calculate and print the difference of product A and B by the product of C and D (A * B - C * D). */

package URI;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int A = 0 ;
            int B = 0;
            int C = 0;
            int D = 0;
            int DIFERENCA = 0;

            A = input.nextInt();
            B = input.nextInt();
            C = input.nextInt();
            D = input.nextInt();

            DIFERENCA = (A*B-C*D);

            System.out.println("DIFERENCA = " + DIFERENCA);
        }
        
    }
        
}
    


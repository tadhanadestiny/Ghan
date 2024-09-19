import java.util.Scanner;
    
public class GroceryShoppingCalculator {

    public static void main(String[] args) throws Exception{
       Scanner scanner = new Scanner(System.in); 
            double[] prices = new double [3];
            int[] quantity = new int [3];
            
            
            for (int i = 0; i < 3; i++) {
                System.out.printf ("Enter the prices of item \t: ", + i + ":");
                prices[i] = scanner.nextDouble();
                System.out.printf("Enter the quantity of item \t: ", + i + ":");
                quantity [i] = scanner.nextInt();
            } 
            
            double subtotal = 0;
            for (int i = 0; i < 3; i++) {
                subtotal += prices [i] * quantity [i];
            }
            
            double discount = subtotal * 0.05;
            double discountedAmount = subtotal - discount;
            double salesTax = discountedAmount * 0.12;
            double finalTotal = discountedAmount + salesTax;
            
            System.out.printf("Subtotal: PHP %.2f\n", subtotal);
            System.out.printf("Discount: PHP %.2f\n", discount);
            System.out.printf("Sales Tax: PHP %.2f\n", salesTax);
            System.out.printf("Final Total: PHP %.2f\n",finalTotal);
        }
        
        }
    


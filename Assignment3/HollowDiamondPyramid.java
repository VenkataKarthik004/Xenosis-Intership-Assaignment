package Assignment3;

import java.util.Scanner;

public class HollowDiamondPyramid {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        // Upper half of the diamond
	        for (int i = 1; i <= rows; i++) {
	            for (int j = rows; j > i; j--) {
	                System.out.print(" ");        // Print spaces
	            }
	            System.out.print("*");      // Print stars
	            if (i > 1) {               // print  inner spaces
	                for (int j = 1; j < (i - 1) * 2; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Lower half of the diamond
	        for (int i = rows - 1; i >= 1; i--) {
	            
	            for (int j = rows; j > i; j--) {
	                System.out.print(" ");           // Print spaces
	            }

	            System.out.print("*");               // Print stars
	            if (i > 1) {                        // Print spaces
	                for (int j = 1; j < (i - 1) * 2; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	 }
}

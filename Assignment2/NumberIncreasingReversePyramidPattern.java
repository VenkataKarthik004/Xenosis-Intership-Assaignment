package Assignment2;

import java.util.Scanner;

public class NumberIncreasingReversePyramidPattern {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//Geting the values in user side by using scanner class
		int rows = sc.nextInt();
		int columns =sc.nextInt();
		//By taking two for loops
		for (int i = 1; i <= rows; i++) {
			int n= 1; //Create integer variable intalize with value 1
			for (int j = columns; j >= 1; j--) { //reverse the J loop for reverse pyramid
				if (j>=i) { 
					System.out.print(n+++" "); // Increment the value (n++)

				} else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
		
	}
}

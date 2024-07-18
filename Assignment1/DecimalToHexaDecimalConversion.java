package Assignment1;

import java.util.Scanner;

public class DecimalToHexaDecimalConversion {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//Geting the values in user side by using scanner class
		int decimal = sc.nextInt();
		
		//Take empty String
		String hexa = "";
		
		//HexaDeciamls means combination of Numbers from 0to9 and Alphabets from A to F.
		//To store the values in character array
		char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
		
		//Take while loop
		while (decimal>0) {
			
			int result = decimal%16; //Fatching the value and to store the value in integer variable 
			hexa+=hexchars[result];  // By concating the value to new String
			decimal/=16;   //Updation purpose
		}
		System.out.println(hexa); //Print the value
	}
}

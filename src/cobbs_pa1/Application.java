package cobbs_pa1;

import java.util.Scanner;


public class Application {
	
	static int[] input = new int [4];
	
	public static void main(String[] args)
	
	{
		
		Scanner sc = new Scanner(System.in);
		 
		//loop to store user input
		for (int i = 0; i < 4; i++ )
		{
		  System.out.println("Please enter a digit ");
		  input[i] = sc.nextInt();
		}
		
		System.out.println("Your four digit number is " + input[0] + input[1] + input[2] + input[3] );
		int[] encryptionResults = Encrypter.encrypt(input);
		
	
		

     }
	
	
	
}	









//array for user 4 digit input
		//int[] input = new int [4];

	
//	public void  setApplicationinput(int[] input)
//	{
//		this.input = input;
//	}
	
	


//String fonum;
//Scanner keyboard = new Scanner(System.in);
//int firstNum; 
//int secondNum;
//int thirdNum;
//int fourthNum; 
//
//
//do 
//{
// System.out.println("Enter a 4 digit number:");
// fonum = keyboard.nextLine();
//  
//  if (fonum.length() == 4)
//  {
//	  System.out.println("WILL ENCRYPT");
//	  int nums = Integer.parseInt(fonum);
//	  System.out.println(nums);
//  }
//}
//
//while(fonum.length() != 4);

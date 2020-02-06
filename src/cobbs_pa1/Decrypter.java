package cobbs_pa1;

public class Decrypter {
	
	static int[] decryptResult = new int[4];
	
	public static int[] decrypt(int[] decryptData)
	{
		
		
		//swap
		
		int temp = decryptData[2];
		decryptData[2] = decryptData[0];
		decryptData[0] = temp;
				
		int temptwo = decryptData[3];
		decryptData[3] = decryptData[1];
		decryptData[1] = temptwo;
	
		for(int i = 0; i < 2; i++)
		{
			decryptResult[i] = (decryptData[i] *10 /10) - 7;
		}
		
		
		
		
		System.out.printf("Your decrypted four digit number is %d %d %d %d \n", decryptResult[0], decryptResult[1],  decryptResult[2], decryptResult[3]);
		return decryptData;
	}

}

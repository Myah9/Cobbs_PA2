package cobbs_pa1;

public class Encrypter {
	
	static int results[] = new int[4];
	
	
	public static int[] encrypt(int[] userData)
	{
		
		for(int i = 0; i < 4; i++)
		{
			results[i] = (userData[i] + 7 ) % 10;
		}
		
		//swap
		int temp = results[0];
		results[0] = results[2];
		results[2] = temp;
		
		int temptwo = results[1];
		results[1] = results[3];
		results[3] = temptwo;
		
		System.out.printf("Your encrypted four digit number is %d %d %d %d \n", results[0], results[1],  results[2], results[3]);
		int[] decryptResult = Decrypter.decrypt(results);
		return results; 
	}

	
}

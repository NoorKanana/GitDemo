package simpleEx;

import java.util.Random; 

public class projectExemple {

	public static int originalOutput = 0; 
	public static int safetyOutput = 0;
	
	private static Random rand = new Random(); 

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = rand.nextInt(10) + 1;
		if (n > 8) {
			System.out.println("Random number is : "+n);
			originalOutput += (n - 8) * 5;
			System.out.println("Number after math. : "+originalOutput+" __which will be input to IHD 'read1'\n read2 = 0 'initlize value'\n read1 = "+originalOutput);
		}

		else if (n < 5)

		{ 
			if (n < 3) {
				System.out.println("Random number is : "+n);
				safetyOutput += n * 5;
				System.out.println("Number after math. : "+safetyOutput+" __which will be input to IHD 'read2'\n read1 = 0 'initlize value'\n read2 = "+safetyOutput);
			}
			else {
				System.out.println("Random number is : "+n);
				safetyOutput += (n - 2) * -5;
				System.out.println("Number after math. : "+safetyOutput+" __which will be input to IHD 'read2'\n read1 = 0 'initlize value'\n read2 = "+safetyOutput);
			}
			
		} 
	
		else {
			System.out.println("Random number is : "+ n +" __som not in IF sats\n In Random method ger 10 numbers from 0-9\n then plus+1 \n so number which we will have here 1-10\n in If sats number' 5,6,7,8 'not manage");
			
		}
	}

}

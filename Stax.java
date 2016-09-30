/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Sept 2016
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("gimme a number (in digits)");
		
		String numbahString = br.readLine();
		int numbah = Integer.parseInt(numbahString);
		
		MrCoxallStack stackOne = new MrCoxallStack();
		stackOne.push(numbah);
		
		
		for (int counter = 0; counter > -1; counter++) {
			
			System.out.println("gimme a number (in digits), if ya wanna pop it type pop");
			
			numbahString = br.readLine();
			
			if (numbahString.equals("pop")) {
				// when the user inputs pop 
				System.out.println(stackOne.pop());
				
			} else {
				
				numbah = Integer.parseInt(numbahString);
				
				//stackOne = new MrCoxallStack();
				stackOne.push(numbah);
				
			}
			
		}
		

		
		
	}

}

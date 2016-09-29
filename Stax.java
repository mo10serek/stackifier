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
		
		int numbah = Integer.parseInt(br.readLine());
		
		MrCoxallStack stackOne = new MrCoxallStack();
		stackOne.push(numbah);
		
	}

}

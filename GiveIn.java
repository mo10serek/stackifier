/*
* Created by: Michael balcerzak
* Created on: 30-Sep-2016
* Created for: ICS3U
* Daily Assignment – Unit#2-02
* This program makes the user to put something in the stack and take something out
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GiveIn {

	public static void main(String[] args) throws IOException {
		MrCoxallStack aSingleStack = new MrCoxallStack();
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		Scanner input = new Scanner(System.in);
		
		int numberOfObjects;
		
		//number of objects to put in the stack
		System.out.println("how many object you want to put in the stack");
		numberOfObjects = (int) input.nextDouble();
		
		for (int counter = 0; counter < numberOfObjects; counter++)
		{
			//input
			System.out.println("enter anything to put in the stack!");
			Object have = br.readLine();
		
			//give
			aSingleStack.push(have);
		}
		//get
		Object get = aSingleStack.pop();
		System.out.println(get);
		
		//get2
		Object get2 = aSingleStack.pop();
		System.out.println(get2);
		
		//get first
		Object getFirst = aSingleStack.Peek();
		System.out.println(getFirst);
		
		//clear the stack
		aSingleStack.Clear();
;
	}

}

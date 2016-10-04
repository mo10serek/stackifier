/*
* Created by: Michael balcerzak
* Created on: 30-Sep-2016
* Created for: ICS3U
* Daily Assignment – Unit#2-02
* This program makes the user to put something in the stack and take something out
*/

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MrCoxallStack<Item> {
	
	//have a list
	private List<Item> myList = new ArrayList<Item>();
	public Object getFirst;
	
	public void push(Item have){
		//add something to the list
		myList.add(have);
	}

	public Object pop(){
		//take something out the list
		Item get;

	    if (myList.size() == 0) {
	        throw new EmptyStackException();
	    }
	    else {	    	
			int listScanner =	myList.size() - 1; 
			get = myList.get(listScanner);
			myList.remove(listScanner);
		}
	  
	    return get;

	}
	
	public Object Peek(){
		//take the first thing in the list
		getFirst = myList.get(0);
		
		return getFirst;
	}
	
	public void Clear(){
			myList.clear();
	}
}

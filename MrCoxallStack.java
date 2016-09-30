/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Sept 2016
 *
 ****************************************************************************/
import java.util.ArrayList;

public class MrCoxallStack {

	ArrayList<Integer> al = new ArrayList<Integer>();
	
	
	public void push (int numbah) {
		
		 al.add(numbah);
		
	}
	
	public int pop(){
		
		int lastIndex =	al.size() - 1; 
		
		int returnValue = al.get(lastIndex);
		
		al.remove(lastIndex);
		
		return returnValue;
		
	}
	
	
}

package Array;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		LinkedList<Integer>ob=newLinkedList<Integer>();
		ob.add(4);
		ob.add(2);
		ob.add(5);
		//System.out.println(object);
		@SuppressWarnings("rawtypes")
		Iterator a=ob.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		
		
		
		
	}

}

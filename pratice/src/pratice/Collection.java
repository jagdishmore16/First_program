package pratice;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Mahi");
		list.add("Shyam");
		list.add("Jagdish");
//		System.out.println(list);
//		
//		list.add("Anshu");	//Randomly added new name
//		System.out.println(list);
//		
//		list.add(2,"Mahesh");	//Randomly add the position on name like first,second,third etc
//		System.out.println(list);
//		
//		list.remove(0);	//Removed position in list randomly
//		System.out.println(list);
//		
//		list.set(0, "jagdish");		//Set is use for replace value in arrayList at any position
//		System.out.println(list);
//		
//		System.out.println(list.get(1));	//Display of specific value by get method using
//		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

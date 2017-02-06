package cornerStore;

import java.util.ArrayList;

public class Item {
	private static int price;
	private static String name;
	private static ArrayList<Item> ItemInfo = new ArrayList<Item>();

	public Item(){
		
	}
	
	public static void addItem(String y, int i) {
	    Item newItem = new Item();
	    newItem.name = y;
	    newItem.price = i;
	    ItemInfo.add(newItem);
	}


	public static Object getName(String a)  
	{    
	    for (int i=0; i <ItemInfo.size(); i++) {
	        if (ItemInfo.get(i).name.equals(a)){
	             return name + " " + "$" +  price; //item is in the array
	        }
	    }
	    return false; //item is not found in the array
	}


	 


}

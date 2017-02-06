package cornerStore;

import java.util.ArrayList;

public class Item {
	private String price;
	private String name;
	private static ArrayList<Item> ItemInfo;

	public Item(){
		
	}
	
	public static void addItem(String y, String i) {
	    Item newItem = new Item();
	    newItem.name = y;
	    newItem.price = i;
	    ItemInfo.add(newItem);
	}
	public static void addItem(String y) {
	    Item newItem = new Item();
	    newItem.name = y;
	    ItemInfo.add(newItem);
	}
 

	public static boolean getName(String a)  
	{    
	    for (int i=0; i <ItemInfo.size(); i++) {
	        if (ItemInfo.get(i).name.equals(a)){
	             return true;
	        }
	    }
	    return false; // no Customer found with this ID; maybe throw an exception
	}
	public static Object getPrice(String a)  
	{    
	    for (int i=0; i <ItemInfo.size(); i++) {
	        if (ItemInfo.get(i).price.equals(a)){
	             return "This user already exists in our database.";
	        }
	    }
	    return "User is not founded."; // no Customer found with this ID; maybe throw an exception
	}



	 


}

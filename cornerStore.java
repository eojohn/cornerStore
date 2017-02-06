package cornerStore;

import java.util.ArrayList;
import java.util.Scanner;

public class cornerStore {

	public static void main(String[] args) {
		Scanner item=new Scanner(System.in);
		ArrayList<Item> an = new ArrayList<Item>();
		System.out.println("How to work the cash registry:");
		System.out.println("1) Enter an item: e.g Laptop ");
		String cashierItem=item.nextLine();
		System.out.println("Enter the price for " + cashierItem);
		int itemPrice= item.nextInt();
		//if(cashierItem.compareTo(new Item()))
		String wb="no";
		//String b=Item.getName();
		Item.addItem(cashierItem, itemPrice);
		System.out.println(Item.getName(cashierItem));
	 
	}

}

package headfirst.iterator.dinermerger;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}
	
	public static void printMenu() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
		
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem) breakfastItems.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t"  + menuItem.getDescription());
		}
		
		MenuItem[] launchItems = dinerMenu.getMenuItems();
		
		for (int i = 0; i < launchItems.length; i++) {
			MenuItem menuItem = launchItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}

}

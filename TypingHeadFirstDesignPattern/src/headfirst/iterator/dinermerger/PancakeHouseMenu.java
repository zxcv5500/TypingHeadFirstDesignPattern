package headfirst.iterator.dinermerger;

import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("K&B 팬 케이크 세트",
				"스크램블드 에그와 토스트가 곁들여진 펜 케이크",
				true,
				2.99 );
		addItem("레귤러 펜케이크 세트",
				"달걀 후라이와 소시지가 곁들여진 팬케이크",
				false,
				2.99 );
		addItem("블루베리 팬케이크",
				"신선한 블루베리와 블루베리 시럽으로 만든 팬케이크",
				true,
				3.49 );
		addItem("와플",
				"와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다.",
				true,
				3.59 );
	}
	
	public void addItem(String name, String description,
			boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}


	
	
	@Override
	public String toString() {
		
		return "Objectville Pancake House Menu";
	}
	
	
	// 기타 메뉴 관련 메소드
	
	
	
}

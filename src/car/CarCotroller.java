package car;

import javax.swing.JOptionPane;

public class CarCotroller {
	
	public static void main(String[] args) {
		CarBean bean = null;
		CarService carService = new CarServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.차량입고\n"
					+ "2.차량목록\n"
					+ "3.차량검색\n"
					+ "4.차량판매\n")) {
			case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				String brand=JOptionPane.showInputDialog("브랜드");
				String color=JOptionPane.showInputDialog("색깔");
				String gear=JOptionPane.showInputDialog("기어");
				String door=JOptionPane.showInputDialog("문갯수");
				carService.add(brand,color,gear,Integer.parseInt(door));
				break;
			case "2":
				carService.list();
				break;
			case "3":
				carService.find();
				break;
			case "4":
				carService.sell();
				break;	
			
			}
		}
	}
}
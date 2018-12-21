package tv;

import javax.swing.JOptionPane;
public class Main {
		public static void main(String[] args) {
			TVBean tvbean = new TVBean(); 
			TVService tvService = new TVService();
			while(true) {
				switch (JOptionPane.showInputDialog("0.종료\n"
						+ "1.TV작동\n"
						+ "2.TV정보보기\n"
						+ "3.계좌확인\n"
						)) {
				case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
						return;
				case "1":
					/*brand,color,price;
					TV브랜드
					TV색상
					가격*/
					String brand =JOptionPane.showInputDialog("tv 브랜드");
					String color =JOptionPane.showInputDialog("tv 컬러");
					String channel =JOptionPane.showInputDialog("tv 채널");
					String price =JOptionPane.showInputDialog("tv 가격");
					tvbean.setBrand(brand);
					tvbean.setColor(color);
					tvbean.setChannel(Integer.parseInt(channel));
					tvbean.setPrice(Integer.parseInt(price));
					JOptionPane.showMessageDialog(null,"등록완료");
					break;
				case"2":
					// 구입한 TV 스펙
					JOptionPane.showMessageDialog(null,tvService.toString(tvbean.getBrand(),
							tvbean.getColor(),
							tvbean.getPrice()));
					break;
		
			}
		}
	}
}
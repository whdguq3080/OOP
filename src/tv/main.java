package tv;

import javax.swing.JOptionPane;
public class main {
		public static void main(String[] args) {
			while(true) {
				switch (JOptionPane.showInputDialog("0.종료\n"
						+ "1.TV작동\n"
						+ "2.TV정보보기\n"
						+ "3.계좌확인\n"
						+ "4.계좌정보\n"
						+ "5.입금\n"
						+ "6.출금\n"
						+ "7.비번변경")) {
				case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
						return;
				case "1":
					/*brand,color,price;
					TV브랜드
					TV색상
					가격*/
					break;
				case"2":
					// 구입한 TV 스펙
					break;
		
			}
		}
	}
}
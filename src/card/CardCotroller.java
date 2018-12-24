package card;

import javax.swing.JOptionPane;
public class CardCotroller {
		public static void main(String[] args) {
			CardBean card = null;
			CardService cardService = new CardServiceImpl();
			while(true) {
				switch (JOptionPane.showInputDialog("0.종료\n"
						+ "1.카드선택\n"
						+ "2.")) {
				case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
					return;
				case "1":
					//카드의 종류
					//카드의 번호\
					String kind = JOptionPane.showInputDialog("베팅");
					String number = JOptionPane.showInputDialog("베팅");
					cardService.bet(kind,Integer.parseInt(number));
					break;
				case "2":
					// 제출한 카드의 스펙
					break;
}
}
}
}
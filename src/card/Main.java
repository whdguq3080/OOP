package card;

import javax.swing.JOptionPane;
public class Main {
		public static void main(String[] args) {
			while(true) {
				switch (JOptionPane.showInputDialog("0.종료\n"
						+ "1.카드선택\n"
						+ "2.회원정보\n"
						+ "3.계좌확인\n"
						+ "4.계좌정보\n"
						+ "5.입금\n"
						+ "6.출금\n"
						+ "7.비번변경")) {
				case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
					return;
				case "1":
					//카드의 종류
					//카드의 번호\
					break;
				case "2":
					// 제출한 카드의 스펙
					break;
}
}
}
}
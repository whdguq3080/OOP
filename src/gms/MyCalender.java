package gms;

public class MyCalender {
	public String leapYear(String y) {
		//String year = "";
			
			String year ="";
			int ly = Integer.parseInt(y);
			if(ly%100==0 && ly%4!=0 || ly%100==0) {
				 	year = "윤년";
			}else {
				 	year = "평년";
			}
			return y+"년:"+year;
	}
}

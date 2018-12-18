package gms;

public class MyCalender {
	public String leapYear(int y) {
		//String year = "";
			
			String year ="";
			if(y%100==0 && y%4!=0 || y%100==0) {
				 	year = "윤년";
			}else {
				 	year = "평년";
			}
			return y+"년:"+year;
	}
}

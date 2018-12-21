package tv;

public class TVService {
	/*public void power() {
		
	}*/
	String brand,color;
	int channel,price;

	
	public String toString(String brand,String color,int price) {
		return String.format("tv 브랜드 %s\n"
				+ "tv 컬러 %s\n"
				+ "가격 %d\n"
				,brand,color,price);
	}
}


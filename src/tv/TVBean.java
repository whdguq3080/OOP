package tv;

public class TVBean {
	private String brand,color;
	private boolean power;
	private int channel,price;
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}public String getBrand() {
		return brand;
	} 
	public void setColor(String color) {
		this.color = color;
	}public String getColor() {
		return color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public boolean getPower(){
		return power;
	
	}public void setChannel(int channel){
		this.channel = channel;
	}
	public int getChannel(){
		return channel;
	
	}public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;	
	}
	public String toString(String brand,String color,int channel,int price) {
		return String.format("1.tv브랜드\n"
				+ "tv 색상\n"
				+ "tv 채널\n"
				+ "tv 가격\n",brand,color,channel,price);
	}

}
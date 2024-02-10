package workExt_1;

public abstract class Pen {
	private String brand;
	private double price;

	public Pen() {
	}

	public Pen(String brand, int price)throws NumberFormatException {
		this.brand = brand;
		this.price = price;
		if(price<=0) {
			throw new NumberFormatException("輸入數值不可小餘零");
		}
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setPrice(int price){
		this.price = price;
		
	}

	String getBrand() {
		return brand;
	}

	double getPrice() {
		return price;
	}
	public abstract void write();
}



package workExt_1;

public class Pencil extends Pen {
	public void write() {
		System.out.println("先削鉛筆再寫");
	}
	double getPrice() {
		return super.getPrice()* 0.8;
	}
	public Pencil(String brand, int price) {
		super(brand,price);
	}
	
}

package workExt_1;

public class InkBrush extends Pen{
	double getPrice() {
		return super.getPrice() * 0.7;
	}
	public InkBrush(String brand, int price) {
		super(brand,price);
	}
	public void write() {
		System.out.println("先沾墨再寫");
	}
}

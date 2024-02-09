package work_5;

public class Question_5_4 {
//• 請設計一個類別MyRectangle:

//  (1) 有兩個double型態的屬性為width, depth
	private double width;
	private double depth;

//	(2) 有三個方法:
//	將收到的引數指定給width屬性
	void setWidth(double width) {
		this.width = width;
	}

//	將收到的引數指定給depth屬性
	void setDepth(double depth) {
		this.depth = depth;
	}

//	能計算該長方形的面積
	double getArea() {
		return width * depth;
	}

//	(3) 有兩個建構子:
//	不帶參數也無內容的建構子
	public Question_5_4() {
	}

//	傳入的兩個引數會指定給對應的屬性
	public Question_5_4(double width, double depth) {
		this.depth = depth;
		this.width = width;
	}
}

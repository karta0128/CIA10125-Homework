package work_5;

public class Question_5_3 {
//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳。
	int maxElement(int x[][]) {
		int maxnumber = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxnumber < x[i][j])
					maxnumber = x[i][j];
			}
		}
		return maxnumber;

	}
	double maxElement(double x[][]) {
		double maxnumber = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxnumber < x[i][j])
					maxnumber = x[i][j];
			}
		}
		return maxnumber;
	}
}

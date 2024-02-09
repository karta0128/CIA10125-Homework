package work_2;

public class Question_2_1 {
//	• 請設計一隻Java程式,可以執行出九九乘法表(使用for和while迴圈)
	void nineForWhile() {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(j + "×" + i + "=" + j * i + "\t");
				j++;
			}
			System.out.println();
		}
	}
//	• 請設計一隻Java程式,可以執行出九九乘法表(使用for和do while迴圈)
	void nineForDoWhile() {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(j + "×" + i + "=" + j * i + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}
//	• 請設計一隻Java程式,可以執行出九九乘法表(使用while和while迴圈)
	void nineWhileDoWhile() {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(j + "×" + i + "=" + j * i + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}
}

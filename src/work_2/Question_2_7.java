package work_2;

public class Question_2_7 {
//	• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
	void out_A_F() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}
	}
}

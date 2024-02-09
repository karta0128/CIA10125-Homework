package work_2;

public class Question_2_2 {
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	void evenSum() {
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("1~1000的偶數和為:" + sum);
	}
}

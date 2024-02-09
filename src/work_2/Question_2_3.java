package work_2;

public class Question_2_3 {
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
	void porductFor() {
		int num = 1;
		for (int i = 1; i <= 10; i++) {
			num *= i;
		}
		System.out.println("1~10的連乘積為(for)：" + num);
	}

//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	void porductWhile() {
		int num = 1, i = 1;
		while (i <= 10) {
			num *= i;
			i++;
		}
		System.out.println("1~10的連乘積為(while)：" + num);
	}
}

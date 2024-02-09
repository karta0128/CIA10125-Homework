package work_5;

public class Question_5_2 {
//	• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值。
	void randAvg() {
		double avg = 0;
		System.out.println("開始從 0 ~ 100 取值：");
		for (int i = 0; i <= 10; i++) {
			int rand = (int) (Math.random() * 101);
			System.out.print(rand + " ");
			avg += rand;
		}
		System.out.println("\n以上10個數值的平均值為：" + avg / 10);
	}
}

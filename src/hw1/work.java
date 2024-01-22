package hw1;

public class work {

	public static void main(String[] args) {
		int num1 = 12, num2 = 6;
		System.out.println("兩數的和為" + (num1 + num2));
		System.out.println("兩數的積為" + num1 * num2);
		System.out.println("=======================");
		
		int egg = 200;
		System.out.println("雞蛋共有" + egg / 12 + "打");
		System.out.println("又剩下" + egg % 12 + "顆");
		System.out.println("=======================");
		
		int time = 256559;
		int sec = time % 60;
		int min = time / 60 % 60;
		int hour = time / 3600 % 24;
		int day = time / 3600 / 24;
		System.out.println(time + " 秒 = " + day + " 天 " + hour + " 小時 " + min + " 分鐘 " + sec + " 秒");
		System.out.println("=======================");
		
		final double PI = 3.1415;
		int radius = 5;
		double circle = radius * radius * PI;
		double perimeter = 2 * radius * PI;
		System.out.printf("圓面積為" + "%.2f\n", circle);
		System.out.printf("圓周長為" + "%.2f\n", perimeter);
		System.out.println("=======================");
		
		int year = 10;
		double IR = 0.02;
		double money = 1500000;
		double totle1 = money;
		for (int i = 0; i < year; i++) {
			totle1 = totle1 + (totle1 * IR);
		}
		System.out.printf("本金加利息一共為" + "%.2f\n", totle1);
		System.out.println("=======================");
		
		double totle2 = money * Math.pow((IR + 1), year);
		System.out.printf("本金加利息一共為" + "%.2f\n", totle2);
		System.out.println("=======================");
		
		System.out.println(5 + 5);
		// 兩數預設值資料型態為int，因資料型態相同，所以數值相加
		System.out.println(5 + '5');
		// 由於'5'代表字元char，因為在char的資料型態小於int資料型態大小，所以會由文字自動換轉換成原字元的萬國碼編號
		System.out.println(5 + "5");
		// 由於"5"String資料型態，且資料大小大於int(5)，因此5(int)會自動轉型成String資料型態的文字，並以文字+文字來運算
	}

}

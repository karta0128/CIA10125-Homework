package hw1;

import java.util.Arrays;
import java.util.Scanner;

public class work3_25 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		int userSelect = 0;
		System.out.println("歡迎使用homework_3，");
		while (userSelect < 4) {
			System.out.print("請選擇要觀看的作業名稱(請輸入數字)：\n1.你是不是三角形阿、2.數字魔王、3.阿文不會中的大樂透 4.離開程式\n你的選擇：");
			userSelect = sc.nextInt();
			if(userSelect>4) {
				System.out.println("輸入錯誤，請重新輸入");
				userSelect = 0;
			}
				
			if (userSelect == 1) {
				System.out.println("拿出三個好的極品(邊長)給我瞧瞧");
				for (int i = 0; i < 2;) {
					System.out.print("第一個邊長：");
					int a = sc.nextInt();
					System.out.print("第二個邊長：");
					int b = sc.nextInt();
					System.out.print("第三個邊長：");
					int c = sc.nextInt();
					int[] T = { a, b, c };
					System.out.print(Triangle(T) + "\n是否要繼續使用?1.要 2.不要");
					i = sc.nextInt();
				}
			} else if (userSelect == 2) { // 猜數字
				System.out.println("歡迎來到數字深淵，你是否準備好擊敗魔王了\n溫馨提醒：若輸入\"66666\"可中途離開遊戲");
				for (int j = 0; j <= 2;) {
					System.out.print("請輸入0~10000的數字：");
					int u = sc.nextInt();
					int r = (int) (Math.random() * 10001);
					if(u==12345) //金手指
						System.out.println("偷偷告訴妳喔 " + r);
					for (j = 0; j <= 1;) {
						int pk = Number(u, r);
						if (pk == 0) {
							j = sc.nextInt() + 1;
						} else if (pk == 1) {
							u = sc.nextInt();
						} else if (pk == 2) {
							System.out.println("已回主畫面");
							j = 3;
						}
					}
				}
			} else if (userSelect == 3) {
				for (int i = 0; i <= 1;) {
					System.out.print("請輸入阿文不想要的數字：(0~9)");
					int f = sc.nextInt();
					if (f > 0 && f < 10) {
						lotto(f);
						System.out.print("是否還要繼續?1.要 2.不要：");
						i += sc.nextInt();
					} else {
						i = 0;
						System.out.println("輸入錯誤，請重新輸入");
					}
				}
			} else if (userSelect == 4)
				System.out.println("已離開程式");
		}
	}

	public static String Triangle(int[] x) {
		Arrays.sort(x);
		if (x[0] + x[1] > x[2]) {
			if (x[0] == x[1] && x[2] != x[1]) {
				return "看起來很高的三角形";
			} else if (x[0] == x[1] && x[1] == x[2]) {
				return "長得像御飯糰的正三角形";
			} else if (x[0] * x[0] + x[1] * x[1] == x[2] * x[2]) {
				return "閃到腰的直角三角形";
			} else {
				return "噗~可憐沒人愛，普通沒什麼特別的三角形";
			}
		} else {
			return "你輸入的是東西嗎?給我一點正常的東西";
		}
	}

	public static int Number(int x, int r) {
		if (x == 66666)
			return 2;
		if (x > 10000 || x < 0) {
			System.out.print("你在輸入甚麼個賴東東，再輸入一次：");
			return 1;
		}
		if (x == r) {
			System.out.print("恭喜挑戰魔王成功!!\n是否還要繼續遊玩?1.要 2.不要 ：");
			return 0;
		}
		if (x < r)
			System.out.print("笑死!!答錯囉~你的數字比魔王數字小，你再猜一次!\n你的數字：");
		if (x > r)
			System.out.print("你在哭喔~你的數字比魔王數字大，你再猜一次!\n你的數字：");
		if (x > r || x < r)
			return 1;
		return 999;
	}

	public static int lotto(int a) {
		int[] b = new int[6];
		System.out.print("反正也不會中!建議阿文的樂透號碼為：");
		for (int i = 0; i < b.length;) {
			int d = 0;
			int r = (int) (Math.random() * 49) + 1;
			if (r / (a * 10) != 1 && r / 10 != a) {
				d = b[i] + r;
				i++;
				System.out.print(d + " ");
			}
		}
		System.out.println();
		return 1;
	}

}

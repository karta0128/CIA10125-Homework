package hw1;

import java.util.Arrays;
import java.util.Scanner;

public class work3_25 {

	public static void main(String[] args) {
		// 主選單設置
		Scanner sc = new Scanner(System.in);
		int userSelect = 0;
		System.out.println("歡迎使用homework_3，");
		while (userSelect < 4) {
			System.out.print("請選擇要觀看的作業名稱(請輸入數字)：\n1.你是不是三角形阿、2.數字先生、3.阿文不會中的大樂透 4.離開程式\n你的選擇：");
			userSelect = sc.nextInt();
			// 檢查使用者再主選單有沒有輸入錯誤
			if (userSelect > 4) {
				System.out.println("輸入錯誤，請重新輸入");
				userSelect = 0;
			}

			// • 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
			if (userSelect == 1) {
				System.out.println("拿出三個好的極品(邊長)給我瞧瞧");
				for (int oneAgain = 0; oneAgain < 2;) {
					System.out.print("第一個邊長：");
					int S1 = sc.nextInt();
					System.out.print("第二個邊長：");
					int S2 = sc.nextInt();
					System.out.print("第三個邊長：");
					int S3 = sc.nextInt();
					int[] totSide = { S1, S2, S3 };
					System.out.print(Triangle(totSide) + "\n是否要繼續使用?1.要 2.不要");
					oneAgain = sc.nextInt();//檢查是否還要再繼續執行程式
				}

			// • 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
			} else if (userSelect == 2) { // 猜數字
				System.out.println("來找尋數字先生的蹤跡吧!!\n溫馨提醒：若輸入\"66666\"可中途離開遊戲");
				for (int oneAgain = 0; oneAgain <= 2;) {
					System.out.print("請輸入0~10000的數字：");
					int userInput = sc.nextInt();
					int r = (int) (Math.random() * 10001);
					for (oneAgain = 0; oneAgain <= 1;) {
						int compare = Number(userInput, r);
						if (compare == 0) {
							oneAgain = sc.nextInt() + 1;
						} else if (compare == 1) {
							userInput = sc.nextInt();
						} else if (compare == 2) {
							System.out.println("已回主畫面");
							oneAgain = 3;
						}
					}
				}

			// • 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
			// 請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
			} else if (userSelect == 3) {
				for (int oneAgain = 0; oneAgain <= 1;) {
					oneAgain = 0;
					System.out.print("請輸入阿文不想要的數字：(1~9)：");
					int weiSelect = sc.nextInt();
					if (weiSelect > 0 && weiSelect < 10) {
						lotto(weiSelect);
						System.out.print("是否還要繼續?1.要 2.不要：");
						oneAgain = sc.nextInt();
					} else {
						oneAgain = 0;
						System.out.println("輸入錯誤，請重新輸入");
					}
				}
			// 離開程式的提示字樣
			} else if (userSelect == 4)
				System.out.println("已離開程式");
		}
	}

	// 檢查是否為三角形方法
	public static String Triangle(int[] x) {
		Arrays.sort(x);
		if (x[0] + x[1] > x[2]) {
			if (x[0] == x[1] && x[1] != x[2] || x[1] == x[2] && x[0] != x[2]) {
				return "看起來很高的等腰三角形";
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

	// 猜數字的方法
	public static int Number(int user, int random) {
		if (user == 12345) // 金手指
			System.out.println("偷偷告訴妳喔 " + random);
		if (user == 66666) // 查看玩家是否要中離
			return 2;
		if (user > 10000 || user < 0) {
			System.out.print("你在輸入甚麼個賴東東，再輸入一次：");
			return 1;
		}
		if (user == random) {
			System.out.print("恭喜找到數字先生!!\n是否還要繼續遊玩?1.要 2.不要 ：");
			return 0;
		}
		// 提示玩家數字的大小
		if (user < random) {
			System.out.print("笑死!!答錯囉~你的數字比數字先生小，你再猜一次!\n你的數字：");
			return 1;
		}else {
			System.out.print("你在哭喔~你的數字比數字先生大，你再猜一次!\n你的數字：");
			return 1;
		}
	}

	// 阿文的樂透方法
	public static int lotto(int user) {
		int[] number = new int[6];
		System.out.print("反正也不會中!建議阿文的樂透號碼為：");
		for (int i = 0; i < number.length;) {
			number[i] = (int) (Math.random() * 49) + 1;
			// 檢查有無重複數字
			for (int j = 0; j < i;j++) {
				if ( number[i] == number[j]) {
					number[i] = (int) (Math.random() * 49) + 1;
					j = 0;
				}
			}
			// 判斷是否式阿文不要的數字
			if (number[i] / (user * 10) != 1 && number[i] % 10 != user) {
				System.out.print(number[i] + " ");
				i++;
			}
		}
		System.out.println();
		return 1;// 設定方法使用，暫時無意義
	}
}

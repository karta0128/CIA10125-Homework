package work_3;

import java.util.Scanner;

public class Question_start {
	public static void main(String[] args) {
		Question_3_1 ans1 = new Question_3_1();
		Question_3_2 ans2 = new Question_3_2();
		Question_3_3 ans3 = new Question_3_3();
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
					System.out.print(ans1.Triangle(totSide) + "\n是否要繼續使用?1.要 2.不要");
					oneAgain = sc.nextInt();// 檢查是否還要再繼續執行程式
				}

				// • 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
			} else if (userSelect == 2) { // 猜數字
				System.out.println("來找尋數字先生的蹤跡吧!!\n溫馨提醒：若輸入\"66666\"可中途離開遊戲");
				for (int oneAgain = 0; oneAgain <= 2;) {
					System.out.print("請輸入0~10000的數字：");
					int userInput = sc.nextInt();
					int r = (int) (Math.random() * 10001);
					for (oneAgain = 0; oneAgain <= 1;) {
						int compare = ans2.Number(userInput, r);
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
						ans3.lotto(weiSelect);
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

}

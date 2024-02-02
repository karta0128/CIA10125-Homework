package work_4;

import java.util.Scanner;

public class Question_4_5 {
//	•請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
	Scanner sc = new Scanner(System.in);

	// 天數計算使用
	public void toDay(int[] date) {
		int[] monthDay = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;
		for (int i = 1; i < date[1]; i++)
			sum += monthDay[i];
		if (date[1] > 2) {
			if (leapYear(date[0])) {
				sum++;
			}
		}
		System.out.println("此為 " + date[0] + " 年的第 " + (sum + date[2]) + " 天");
	}

	// 檢查使用者輸入內容是否有錯誤
	public void date() {
		int[] date = new int[3];
		for (int i = 0; i < date.length; i++) {
			if (i == 0)
				System.out.print("請輸入年份：");
			if (i == 1)
				System.out.print("\n請輸入月份：");
			if (i == 2)
				System.out.print("\n請輸入日期：");
			date[i] = sc.nextInt();
			if (date[1] >= 13) {
				System.out.println("月份輸入錯誤，請重新輸入!");
				i--;
			}
			if (date[1] == 2) {
				if (date[2] > 30 || date[2] < 0 && leapYear(date[0])) {
					System.out.println("閏年的二月最多只有29天，請重新輸入");
					i = 1;
				} else {
					if (date[2] > 29 || date[2] < 0) {
						System.out.println("這個年份的二月只有28天，請重新輸入");
						i = 1;
					}
				}
			}
			if (date[1] <= 7 && date[1] % 2 == 0 && date[1] != 2 && date[2] >= 31) {
				System.out.println("你輸入的月份天數是錯誤的" + date[1] + "月，最多只有30天，請重新輸入");
				i--;
			}
			if (date[1] >= 8 && date[1] % 2 != 0 && date[2] >= 31) {
				System.out.println("你輸入的月份天數是錯誤的" + date[1] + "月，最多只有30天，請重新輸入");
				i--;
			}
		}
		toDay(date);
	}

	// 判斷是否為閏年
	public boolean leapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0)
			return true;
		else if (year % 400 == 0 && year % 100 == 0)
			return true;
		else
			return false;
	}
}

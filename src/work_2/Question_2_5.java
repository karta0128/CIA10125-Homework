package work_2;

public class Question_2_5 {
//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?(方法一)
	void lotto() {
		int a = 0;
		System.out.println("阿文可以選擇的數字有：");
		for (int i = 0; i <= 30; i += 10) {
			for (int j = 0; j <= 9; j++)
				if (j != 4 && i + j != 0) {
					System.out.print(i + j + " ");
					a++;
				}
			System.out.println();
		}
		System.out.println("總共有" + a + "個數字可以選");

	}

//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?(方法二)
	void lotto2() {
		int a = 0;
		System.out.println("阿文可以選擇的數字有：");
		for (int i = 0; i <= 30; i += 10) {
			for (int j = 0; j <= 9; j++)
				if (j != 4 && i + j != 0) {
					System.out.print(i + j + " ");
					a++;
				}
			System.out.println();
		}
		System.out.println("總共有" + a + "個數字可以選");

	}
}

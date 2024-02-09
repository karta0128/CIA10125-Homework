package work_3;

public class Question_3_3 {
	// 阿文的樂透方法
	public static void lotto(int user) {
		int[] number = new int[6];
		System.out.print("反正也不會中!建議阿文的樂透號碼為：");
		for (int i = 0; i < number.length;) {
			number[i] = (int) (Math.random() * 49) + 1;
			// 檢查有無重複數字
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
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
	}
}

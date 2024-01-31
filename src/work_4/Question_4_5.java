package work_4;

public class Question_4_5 {
//	•請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
	public void toDay(int[] date) {
		int sum = 0;
		sum += (date[1]-1)*30;
		sum = sum + date[1]/2;
		if(date[1]>7)
			sum++;
		if(date[1]>=2)
			if(date[0]/4==0)
				sum = sum -1;
			else
				sum = sum -2;
		System.out.println(sum + date[2]);
	}
}


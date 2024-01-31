package work_4;

public class Question_4_6 {
//	班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數

	public void highScore(int[][] student) {
		int[] sum = {0,0,0,0,0,0,0,0};
		for(int i = 0;i<student.length;i++) {
			int indexS = 0;
			for(int j=1;j<student[i].length;j++) {
				if(student[i][indexS]<student[i][j])
					indexS = j;
			}
			sum[indexS] = sum[indexS] + 1;
		}
		for(int i =0 ;i<sum.length;i++)
			System.out.println("號碼" + (i+1) +"的高分次數為 "+ sum[i]);
	}
}


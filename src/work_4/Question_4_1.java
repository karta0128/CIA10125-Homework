package work_4;

//有個一維陣列如下:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
public class Question_4_1 {
	
	// 計算平均值
	public double arraysAvg(int[] intArrays) {
		double sum = 0;
		for (int i = 0; i < intArrays.length; i++)
			sum += intArrays[i];
		return sum / intArrays.length;
	}

	// 找尋大於平均值的數
	public void GTA(int[] intArrays) {
		double avg = arraysAvg(intArrays);
		System.out.print("此陣列的平均值為：" + avg + "\n大於平均值的元素為：");
		for (int i = 0; i < intArrays.length; i++) {
			if (intArrays[i] > avg)
				System.out.print(intArrays[i] + " ");
		}
	}
}

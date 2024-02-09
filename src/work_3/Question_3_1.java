package work_3;

import java.util.Arrays;

public class Question_3_1 {
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

}

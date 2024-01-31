package work_4;

public class Question_4_3 {
//	有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	public void aeiouSum(String[] x) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int g = 0; g < x.length; g++) {
			for (int j = 0; j < x[g].length(); j++) {
				switch (x[g].charAt(j)) {
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
					break;
				default:
					break;
				}
			}
		}
		int sum = a + e +i+o+u;
		System.out.println("陣列共有" + sum + "個母音\na = " + a + ", e = " + e + ", i = " + i + ", o = "+ o + ", u = "+ u);
	}
}

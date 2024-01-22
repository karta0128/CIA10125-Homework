package hw1;

public class Homework2 {

	public static void main(String[] args) {
//		nineForWhile();
//		nineForDoWhile();
//		nineWhileDoWhile();
//		evenSum();
//		porductFor();
//		porductWhile();
//		out_1_100();
//		lotto();
//		lotto2();
//		out_1_10();
//		out_A_F();
	}

	public static void nineForWhile() {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(j + "×" + i + "=" + j * i + "\t");
				j++;
			}
			System.out.println();
		}
	}

	public static void nineForDoWhile() {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(j + "×" + i + "=" + j * i + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}

	public static void nineWhileDoWhile() {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(j + "×" + i + "=" + j * i + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}

	public static void evenSum() {
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("1~1000的偶數和為:" + sum);
	}

	public static void porductFor() {
		int num = 1;
		for (int i = 1; i <= 10; i++) {
			num *= i;
		}
		System.out.println("1~10的連乘積為(for)：" + num);
	}

	public static void porductWhile() {
		int num = 1, i = 1;
		while (i <= 10) {
			num *= i;
			i++;
		}
		System.out.println("1~10的連乘積為(while)：" + num);
	}

	public static void out_1_100() {
		for (int i = 1; i <= 10; i++)
			System.out.print(i * i + " ");
		System.out.println();
	}

	public static void lotto() {
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

	public static void lotto2() {
		int a = 0;
		System.out.println("阿文可以選擇的數字有：");
		for (int i = 1; i <= 39; i++) {
			if (i % 10 != 4) {
				System.out.print(i + " ");
				a++;
			}
		}
		System.out.println("\n總共有" + a + "個數字可以選");
	}

	public static void out_1_10() {
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void out_A_F() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}
	}
}

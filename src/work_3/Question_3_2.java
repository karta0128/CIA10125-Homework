package work_3;

public class Question_3_2 {
	// 猜數字的方法
	public static int Number(int user, int random) {
		if (user == 12345) // 金手指
			System.out.println("偷偷告訴妳喔 " + random);
		if (user == 66666) // 查看玩家是否要中離
			return 2;
		if (user > 10000 || user < 0) {
			System.out.print("你在輸入甚麼個賴東東，再輸入一次：");
			return 1;
		}
		if (user == random) {
			System.out.print("恭喜找到數字先生!!\n是否還要繼續遊玩?1.要 2.不要 ：");
			return 0;
		}
		// 提示玩家數字的大小
		if (user < random) {
			System.out.print("笑死!!答錯囉~你的數字比數字先生小，你再猜一次!\n你的數字：");
			return 1;
		} else {
			System.out.print("你在哭喔~你的數字比數字先生大，你再猜一次!\n你的數字：");
			return 1;
		}
	}
}

package work_5;

public class Question_5_5 {
//	• 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合。

	String genAuthCode(int count) {
		int Char;
		String captcha = "";
		for (int i = 0; i < 8; i++) {
			Char = (int) ((Math.random() * 74) + 48);
			if ((Char >= 91 && Char <= 96) || (Char >= 58 && Char <= 64)) {
				Char = (int) ((Math.random() * 74) + 48);
				i--;
			} else {
				captcha += (char) (Char);
			}
		}
		return captcha;
	}
}

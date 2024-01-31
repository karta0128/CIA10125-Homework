package work_4;

public class Question_4_2 {
//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
	public void revers(String x) {
		String ans="";
		for(int i= x.length()-1;i>=0;i--) {
			ans+=x.charAt(i);
		}
		System.out.println(ans);
	}
}

package work_4;

public class Question_4_4 {
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//	員工編號：		25		32		8		19		27
//	身上現金：     2500   	800		500		1000	1200
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
	public void cash(int[][] friend,int money) {
		int porson = 0;
		System.out.print("員工編號：");
		for(int i =0;i<friend.length;i++) {
				if(friend[i][1]>=money) {
					porson++;
					System.out.print(friend[i][0] + " ");
				}
		}
		if(porson>0)
			System.out.println("共有 " + porson + " 人");
		else
			System.out.println("好可憐，都沒人可以借你");
		
	}
}

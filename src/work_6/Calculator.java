package work_6;

public class Calculator {

	int powerXY(int x, int y) throws CalException {
		if (y == 0 || x == 0)
			throw new CalException("輸入的值不能等於\"0\"請重新輸入!");
		if (y < 0)
			throw new CalException("輸入的次方值為負數，結果回傳不是整數，請重新輸入!");
		if (x>0 || x<0) {}
		else {
			throw new CalException("輸入的格式不正確，請重新輸入!");}
		int num = x;
		for (; y > 1; y--)
			num = num * x;
		return num;
	}

}

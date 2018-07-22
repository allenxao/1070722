package tw.org.iii.mytest;

public class Brad02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 10, a2 = 3;
		int a3 = a1 / a2; //已經取整數了
		//int a3 = a1 / 3.0 //會出現錯誤
		System.out.println(a3);
		byte b1=10,b2=3;
		//byte b3 = b1/ b2; //byte short int運算完的結果都會變成int
		byte b3 = (byte)(b1/b2); //可以強制轉型態
		System.out.println(b3);
		//byte b4 = b1 + 3; //b1是變數不行
		byte b4 = 10 + 3; //常數運算可以 
		byte b5 = 127;
		b5++; //位元運算，會往前一位元變成-128，不會超出範圍
		System.out.println(b5);
		b5--;
		System.out.println(b5);
		b5 += 4;
		System.out.println(b5);
		b5 -= 4;
		System.out.println(b5);
		//b5 = b5 + 4; //若是用數學運算就會出現錯誤
		
	}

}

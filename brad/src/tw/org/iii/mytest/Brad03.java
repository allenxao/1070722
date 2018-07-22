package tw.org.iii.mytest;

public class Brad03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float f1 = 1.2; //1.2=> double 會出現錯誤; 12 => int
		float f1 = 1.2f; //要在後面加上f
		double s1 = 12.3;
		
		f1++;
		System.out.println(f1);
		f1 += 10;
		System.out.println(f1);
		
		
		int a1 = 10;
		//int a2 = a1 + f1; // int + float 會出錯
		float a2 = a1 + f1; //int + float = float 
		System.out.println(a2);
	}

}

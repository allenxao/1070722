package tw.org.iii.mytest;

public class Brad05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';	//單引號只能包一個字元
		System.out.println(c1);
		char c2 = '資';
		System.out.println(c2);
		char c3 = 97;	//無正負號,0-65535 會印出該數字的ASCII CODE
		System.out.println(c3);
		char c4 = '\u0041'; //16進位
		System.out.println(c4);		
		System.out.println(012); // 0開頭視為8進位 會印出 10
		System.out.println(0x12); //0x開頭視為16進位 會印出 18
		
		int a1 = c1+4;
		System.out.println(c1); 
	}

}

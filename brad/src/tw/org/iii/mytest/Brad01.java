package tw.org.iii.mytest;

public class Brad01 {
//有物件導向才會寫在這裡
	public static void main(String[] args) {
		//程式碼都寫在這個區間
		//變數一定要先宣告，宣告之後不能變
		//程式一開就先到偏好設定將編碼設定為UTF8**********
		byte b1;	//宣告b1為byte，-128 ~ 127 => 2^8，JAVA都有正負號
		byte b2 = 12; //同時給值
		byte b3 = 127;
		//命名規則 第一碼[a-zA-Z$_] 第二碼以後[a-zA-Z0-9$_]*
		//不要撞到關鍵字
		//可以用中文 但不建議
		byte 變數1 = 123;
		System.out.println(變數1);
		
		
		short s1 = 128; //2^16
		short s2 = 32767;
		//short s3 = 32768;
		
		int a1 = 123; // 2^32
		//最常用
		long g1 = 123; // 2^64
		
	}

}

package tw.org.iii.mytest;

public class Brad07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score = Math.random()*101+0; //亂數傳回0.0~0.999999999999
		                            //101是個數，0是位移
		System.out.println((int)score);
		if (score>= 90) {
			System.out.println("A");
		}else if (score>= 80) {
			System.out.println("B"); //if 後面沒括號的話只會執行單行判斷就跳出
			score=58;	//score會指定為58但不會進入下面的if判斷
		}else if (score>= 70) {
			System.out.println("C");
		}else if (score>= 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		//if else if 是由 if else簡化而來的	
		
		
		
	}

}

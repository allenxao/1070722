package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class Brad04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = JOptionPane.showInputDialog("輸入一個字串");
		//JOptionPane可以直接輸入JOP 用選的，會自動import
		String a2 = JOptionPane.showInputDialog("輸入一個字串2");
		System.out.println(a1 + " : " + a2);
		
		int i1 = Integer.parseInt(a1);
		int i2 = Integer.parseInt(a2);
		
		System.out.println(i1 + "/" + i2 + " = " + i1/i2 + "......" + i1%i2);
		//取餘數用%
	}

}

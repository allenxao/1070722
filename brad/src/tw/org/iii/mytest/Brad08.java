package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class Brad08 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String strYear = JOptionPane.showInputDialog("請輸入西元年：");
		int year = Integer.parseInt(strYear);
		
		if(year%4==0) { 
			if(year%100==0)	{
				if(year%400==0)	{
				System.out.println();
				}
			}
		}
			
		
	}

}

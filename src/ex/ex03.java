﻿package ex;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner (System.in);
			System.out.println("請輸入一串數字: ");
			String val=src.next();
			
			 decomp(val);
	}
	
	
	public static void decomp(String a)
	{
		 for(int i=0;i<a.length();i++)
		 {
			 System.out.print(a.charAt(i));
			 System.out.print(" ");
		 }
	}
	

}

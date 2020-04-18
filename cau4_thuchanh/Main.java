package cau4_th;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);
		List<Xe> xes = new ArrayList<Xe>();

		System.out.println("nhap n:");
		int n = scanner.nextInt();
		Xe[]a =  new Xe[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = new Xe();
			a[i].nhapthongtin();
			xes.add(a[i]);
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("tien thue phai dong cua xe thu:"+i+"="+a[i].toString());
		}
	}
}












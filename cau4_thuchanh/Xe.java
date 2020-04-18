package cau4_th;

import java.util.Scanner;

public class Xe 
{
	private String tenchuxe;
	private String loaixe;
	private int trigiaxe;
	private int dungtich;
	Scanner scanner = new Scanner(System.in);
	public Xe() {
		super();
	}

	public Xe(String tenchuxe, String loaixe, int trigiaxe, int dungtich) {
		super();
		this.tenchuxe = tenchuxe;
		this.loaixe = loaixe;
		this.trigiaxe = trigiaxe;
		this.dungtich = dungtich;
	}

	public String getTenchuxe() {
		return tenchuxe;
	}

	public void setTenchuxe(String tenchuxe) {
		this.tenchuxe = tenchuxe;
	}

	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getTrigiaxe() {
		return trigiaxe;
	}

	public void setTrigiaxe(int trigiaxe) {
		this.trigiaxe = trigiaxe;
	}

	public int getDungtich() {
		return dungtich;
	}

	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}

	@Override
	public String toString() {
		return "Xe [tenchuxe=" +tenchuxe + ", loaixe=" + loaixe + ", trigiaxe=" + trigiaxe + ", dungtich=" + dungtich
				+ ",thue="+this.tinhthue()+"]";
	}
	
	public int tinhthue()
	{
		int thue=0;
		if(this.dungtich <100)
		{
			return thue+=this.trigiaxe*1/100;
		}
		
		else if(100< this.dungtich && this.dungtich <175)
		{
			return thue+=this.trigiaxe*3/100;
		}
		else 
		{
			return thue+=this.trigiaxe*5/100;
		}
	}

	public void nhapthongtin() 
	{	
		while(true)
		{
			System.out.println("nhap ten chu xe:");

			tenchuxe = scanner.nextLine();
			
			if(!this.tenchuxe.isEmpty())
			{
				System.out.println(this.tenchuxe);
				System.out.println("nhap loai xe:");
				loaixe = scanner.nextLine();
			
				System.out.println("nhap tri gia xe:");
				trigiaxe = scanner.nextInt();
				
				System.out.println("nhap dung tich xe:");
				dungtich = scanner.nextInt();
			}
			else if(this.tenchuxe.isEmpty())
			{
				break;
			}
		}
	}
	
	public void inthongtin()
	{
		System.out.println("ten chu xe:"+tenchuxe);
		System.out.println("loai xe:"+loaixe);
		System.out.println("gia xe:"+trigiaxe);
		System.out.println("dung tich:"+dungtich);
		System.out.println("thue"+this.tinhthue());
	}
}





























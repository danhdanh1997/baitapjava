package cau2_th;

import java.util.Scanner;

public class HinhChuNhat
{
	private double chieudai;
	private double chieurong;
	Scanner scanner = new Scanner(System.in);
	public HinhChuNhat() {
		super();
	}

	public HinhChuNhat(double chieudai, double chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}

	@Override
	public String toString() {
		return "HinhChuNhat [chieudai=" + chieudai + ", chieurong=" + chieurong + ",chu vi="+this.tinhchuvi()+",dien tich="+this.tinhdientich()+"]";
	}
	
	public double tinhchuvi()
	{
		return this.chieudai+this.chieurong*2;
	}
	
	public double tinhdientich()
	{
		return this.chieudai*this.chieurong;
	}
	
	public void nhapthongtin()
	{
		System.out.println("nhap chieu dai:");
		chieudai = scanner.nextDouble();
		
		System.out.println("nhap chieu rong:");
		chieurong = scanner.nextDouble();
	}
}
















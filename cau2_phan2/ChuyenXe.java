package cau2_p2;

import java.util.Scanner;

public class ChuyenXe 
{
	Scanner scanner =  new Scanner(System.in);
	protected int masochuyen;
	protected String ten;
	protected String soxe;
	protected int khoiluong;
	protected double doanhthu;
	
	public ChuyenXe() {
		super();
	}

	public ChuyenXe(int masochuyen, String ten, String soxe, int khoiluong) {
		super();
		this.masochuyen = masochuyen;
		this.ten = ten;
		this.soxe = soxe;
		this.khoiluong = khoiluong;
	}

	public int getMasochuyen() {
		return masochuyen;
	}

	public void setMasochuyen(int masochuyen) {
		this.masochuyen = masochuyen;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSoxe() {
		return soxe;
	}

	public void setSoxe(String soxe) {
		this.soxe = soxe;
	}

	public int getKhoiluong() {
		return khoiluong;
	}

	public void setKhoiluong(int khoiluong) {
		this.khoiluong = khoiluong;
	}

	public double getDoanhthu() {
		return doanhthu;
	}

	public void setDoanhthu(double doanhthu) {
		this.doanhthu = doanhthu;
	}

	@Override
	public String toString() {
		return "ChuyenXe [masochuyen=" + masochuyen + ", ten=" + ten + ", soxe=" + soxe + ", khoiluong=" + khoiluong
				+ ", doanhthu=" + doanhthu + "]";
	}
	
	public void nhapthongtin()
	{
		System.out.println("nhap ma so chuyen:");
		masochuyen = scanner.nextInt();
		
		System.out.println("nhap ho ten tai xe:");
		ten = scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.println("nhap bien so xe:");
		soxe = scanner.nextLine();
		
		System.out.println("nhap khoi luong hang hoa:");
		khoiluong =  scanner.nextInt();
	}
	
	public double tinhdoanhthu()
	{
		return 1;
	}
}

























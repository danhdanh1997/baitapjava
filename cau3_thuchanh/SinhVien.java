package cau3_th;

import java.util.Scanner;

public class SinhVien 
{
	private int masv;
	private String hoten;
	private float diemlt;
	private float diemth;
	
	Scanner scanner = new Scanner(System.in);
	public SinhVien() {
		super();
		masv=0;
		hoten="";
		diemlt=0;
		diemth=0;
	}

	public SinhVien(int masv, String hoten, float diemlt, float diemth) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.diemlt = diemlt;
		this.diemth = diemth;
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public float getDiemlt() {
		return diemlt;
	}

	public void setDiemlt(float diemlt) {
		this.diemlt = diemlt;
	}

	public float getDiemth() {
		return diemth;
	}

	public void setDiemth(float diemth) {
		this.diemth = diemth;
	}

	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", diemlt=" + diemlt + ", diemth=" + diemth + ",diemtb= "+this.tinhdiemtb()+"]";
	}
	
	public float tinhdiemtb()
	{
		return (this.diemlt+this.diemth)/2;
	}
	
	public void inthongtin()
	{
		System.out.println(this.toString());
	}
	
	public void nhapthongtin()
	{
		System.out.println("nhap masv:");
		masv = scanner.nextInt();
		scanner.nextLine();
		System.out.println("nhap ten sv:");
		hoten = scanner.nextLine();
		
		System.out.println("nhap diem lt:");
		diemlt = scanner.nextFloat();
		
		System.out.println("nhap diem th:");
		diemth = scanner.nextFloat();
	}
}
























	

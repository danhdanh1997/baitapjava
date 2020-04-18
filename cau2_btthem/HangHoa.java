package cau2_btt;

import java.util.Scanner;

public abstract class HangHoa
{
	Scanner scanner = new Scanner(System.in);
	protected String mahang;
	protected String tenhang;
	protected int soluongton;
	protected long dongia;
	
	public abstract void danhgia();
	
	public abstract void tinhtien();

	public HangHoa()
	{
		super();
	}

	public HangHoa(String mahang, String tenhang, int soluongton, long dongia)
	{
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.soluongton = soluongton;
		this.dongia = dongia;
	}

	public String getMahang() {
		return mahang;
	}

	public void setMahang(String mahang) {
		this.mahang = mahang;
	}

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public int getSoluongton() {
		return soluongton;
	}

	public void setSoluongton(int soluongton) {
		this.soluongton = soluongton;
	}

	public long getDongia() {
		return dongia;
	}

	public void setDongia(long dongia) {
		this.dongia = dongia;
	}

	@Override
	public String toString() {
		return "HangHoa [mahang=" + mahang + ", tenhang=" + tenhang + ", soluongton=" + soluongton + ", dongia="
				+ dongia + "]";
	}
	
	public void nhapthongtin()
	{
	
		System.out.println("nhap ma hang hoa:");
		mahang = scanner.nextLine();
		
		if(!this.getMahang().isEmpty())
		{
			System.out.println("nhap ten hang:");
			tenhang = scanner.nextLine();
			
			System.out.println("nhap so luong ton:");
			soluongton = scanner.nextInt();
			
			System.out.println("nhap don gia:");
			dongia = scanner.nextLong();
		}
	}
	
	public boolean kiemtra(HangHoa hh)
	{
		if(!this.getMahang().equalsIgnoreCase(hh.getMahang()))
		{
			return true;
		}
		return false;
	}
}

















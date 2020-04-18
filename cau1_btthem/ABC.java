package cau1_btt;

import java.util.Scanner;

public abstract class ABC 
{
	protected String makh;
	protected String tenkh;
	protected int ngayhoadon;
	protected int soluongdien;
	protected long dongia;
	
	Scanner scanner = new Scanner(System.in);
	public ABC() {
		super();
	}

	
	public ABC(String makh, String tenkh, int ngayhoadon, int soluongdien, long dongia) {
		super();
		this.makh = makh;
		this.tenkh = tenkh;
		this.ngayhoadon = ngayhoadon;
		this.soluongdien = soluongdien;
		this.dongia = dongia;
	}

	public ABC(String makh, String tenkh, int soluongdien, long dongia) {
		super();
		this.makh = makh;
		this.tenkh = tenkh;
		this.soluongdien = soluongdien;
		this.dongia = dongia;
	}

	public String getMakh() {
		return makh;
	}


	public void setMakh(String makh) {
		this.makh = makh;
	}


	public String getTenkh() {
		return tenkh;
	}


	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}


	public int getNgayhoadon()
	{
		return this.ngayhoadon;
	}


	public void setNgayhoadon(int ngayhoadon) {
		this.ngayhoadon = ngayhoadon;
	}


	public int getSoluongdien() {
		return soluongdien;
	}


	public void setSoluongdien(int soluongdien) {
		this.soluongdien = soluongdien;
	}


	public long getDongia() {
		return dongia;
	}


	public void setDongia(long dongia) {
		this.dongia = dongia;
	}
	
	
	
	@Override
	public String toString() {
		return "ABC [makh=" + makh + ", tenkh=" + tenkh + ", ngayhoadon=" + this.getNgayhoadon() + ", soluongdien=" + soluongdien
				+ ", dongia=" + dongia + "]";
	}


	public abstract long tinhtien();
	
	public void nhapthongtin()
	{
		while(true)
		{
			System.out.println("nhap makh:");
			makh = scanner.nextLine();
			
			if(!this.getMakh().isEmpty())
			{
				System.out.println("nhap ten kh:");
				tenkh = scanner.nextLine();
			
//				System.out.println("nhap ngay hoa don:");
//				ngayhoadon = scanner.nextInt();
				
				System.out.println("nhap so luong dien su dung:");
				soluongdien = scanner.nextInt();
				
				System.out.println("nhap vao don gia:");
				dongia = scanner.nextLong();
			}
			else 
				return;
		}
		
	}
	
	public boolean kiemtra(ABC abc)
	{
		if(abc.getMakh().isEmpty())
		{
			if(this.getMakh().equalsIgnoreCase(abc.getMakh()) && this.getTenkh().equalsIgnoreCase(abc.getTenkh())  && abc.getNgayhoadon()!=this.getNgayhoadon())
			{
				return true;
			}
			return false;
		}
		return false;
	}
	
	public int getngay()
	{
			int thang , nam;
			System.out.println("nhap thang ");
			thang =  scanner.nextInt();
			
			System.out.println("nhap nam:");
			nam = scanner.nextInt();
			
			switch(thang)
			{
				case 1: this.ngayhoadon=31;break;
				case 3: this.ngayhoadon=31;break;
				case 5: this.ngayhoadon=31;break;
				case 7: this.ngayhoadon=31;break;
				case 8: this.ngayhoadon=31;break;
				case 10:this.ngayhoadon=31;break;
				case 12:this.ngayhoadon=31;break;
					
				case 4:this.ngayhoadon=30;break;
				case 6:this.ngayhoadon=30;break;
				case 9:this.ngayhoadon=30;break;
				case 11:this.ngayhoadon=30;break;
				
				case 2:
				if(nam % 400==0 || nam %100==0 && nam %4==0)
				{
					this.ngayhoadon=29;break;
				}
				this.ngayhoadon=28;break;
			}
		
		return this.ngayhoadon;
	}
}













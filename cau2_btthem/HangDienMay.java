package cau2_btt;

import java.util.Scanner;

public class HangDienMay extends HangHoa
{
	Scanner scanner = new Scanner(System.in);
			
	private String thuonghieu;
	private String loaimay;
	private int thoigianbaohanh;
	
	
	
	public HangDienMay()
	{
		super();
	}
	
	
	public HangDienMay(String mahang, String tenhang, int soluongton, long dongia,String thuonghieu, String loaimay, int thoigianbaohanh)
	{
		super(mahang,tenhang,soluongton,dongia);
		this.thuonghieu = thuonghieu;
		this.loaimay = loaimay;
		this.thoigianbaohanh = thoigianbaohanh;
	}


	
	public String getThuonghieu() {
		return thuonghieu;
	}


	public void setThuonghieu(String thuonghieu) {
		this.thuonghieu = thuonghieu;
	}


	public String getLoaimay() {
		return loaimay;
	}


	public void setLoaimay(String loaimay) {
		this.loaimay = loaimay;
	}


	public int getThoigianbaohanh() {
		return thoigianbaohanh;
	}


	public void setThoigianbaohanh(int thoigianbaohanh) {
		this.thoigianbaohanh = thoigianbaohanh;
	}

	@Override
	public String toString() {
		return "HangDienMay [mahang=" + mahang + ", tenhang=" + tenhang + ", soluongton=" + soluongton + ", dongia=" + 
				+ dongia +",thuonghieu=" + thuonghieu + ", loaimay=" + loaimay + ", thoigianbaohanh=" + thoigianbaohanh
				+ "]";
	}


	@Override
	public void danhgia()
	{
		if(this.getSoluongton()<3)
		{
			System.out.println("Ban duoc:");
		}
		else 
		{
			System.out.println("Ban khong tot:");
		}
	}
	@Override
	public  void tinhtien() 
	{
		System.out.println("nhap vao so luong hang ban duoc:");
		int n = scanner.nextInt();
		
		System.out.println("so tien thu lai duoc la:"+this.getDongia()*n*1/10);
		
		System.out.println("So hang con lai trong kho la:"+(this.getSoluongton()-n));
	}
	
	@Override
	public void nhapthongtin() 
	{
		super.nhapthongtin();
		
		System.out.println("nhap thuong hieu:");
		thuonghieu = scanner.nextLine();
		
		System.out.println("nhap loai may:");
		loaimay = scanner.nextLine();
		
		System.out.println("nhap vao thoi gian bao hanh:");
		thoigianbaohanh = scanner.nextInt();
	}
	
	public boolean kiemtra(HangDienMay hdm)
	{
		return super.kiemtra(hdm);
	}
}








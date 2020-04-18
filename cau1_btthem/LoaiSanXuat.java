package cau1_btt;

public class LoaiSanXuat extends ABC
{
	private int loaidien;

	public LoaiSanXuat(String makh,String tenkh,int ngayhoadon,int soluongdien,long dongia,int loaidien) 
	{
		super(makh,tenkh,ngayhoadon,soluongdien,dongia);
		this.loaidien = loaidien;
	}
	
	public LoaiSanXuat(String makh,String tenkh,int soluongdien,long dongia)
	{
		super(makh,tenkh,soluongdien,dongia);
	}

	public LoaiSanXuat() 
	{
		super();
	}

	public int getLoaidien() {
		return loaidien;
	}

	public void setLoaidien(int loaidien) {
		this.loaidien = loaidien;
	}

	@Override
	public String toString() {
		return "LoaiSanXuat [loaidien=" + loaidien + ",makh=" + makh + ", tenkh=" + tenkh + ", ngayhoadon=" + this.getNgayhoadon() + ", soluongdien=" + soluongdien+", dongia=" + dongia + ",thanh tien= "+this.tinhtien()+"]";
	}

	@Override
	public long tinhtien()
	{	
		if(this.getLoaidien()==2 && this.getSoluongdien()<=200)
		{
			return this.getSoluongdien()*this.getDongia();
		}
		
		else if(this.getLoaidien()==2 && this.getSoluongdien()>200)
		{
			return this.getSoluongdien()*this.getDongia()*2/100;
		}
		
		else if(this.getLoaidien()==3 && this.getSoluongdien()<=150)
		{
			return this.getSoluongdien()*this.getDongia();
		}
		
		else if(this.getLoaidien()==3 && this.getSoluongdien()>=150)
		{
			return this.getSoluongdien()*this.getDongia()*3/100;
		}
		return this.getDongia()*this.getSoluongdien();
	}
	
	public void nhapthongtin()
	{
		super.nhapthongtin();
		System.out.println("nhap vao loai dien su dung:");
		loaidien = scanner.nextInt();
	}
	
}




















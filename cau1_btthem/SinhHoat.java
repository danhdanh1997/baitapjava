package cau1_btt;

public class SinhHoat extends ABC
{
	private int dinhmuc;

	public SinhHoat(String makh,String tenkh,int ngayhoadon,int soluongdien,long dongia,  int dinhmuc)
	{
		super(makh,tenkh,ngayhoadon,soluongdien,dongia);
		this.dinhmuc = dinhmuc;
	}

	public SinhHoat(String makh,String tenkh,int soluongdien,long dongia)
	{
		super(makh,tenkh,soluongdien,dongia);
	}
	
	public SinhHoat() {
		super();
	}

	public int getDinhmuc() {
		return dinhmuc;
	}

	public void setDinhmuc(int dinhmuc) {
		this.dinhmuc = dinhmuc;
	}

	@Override
	public long tinhtien()
	{
		if(this.getSoluongdien()>this.getDinhmuc())
		{
			return this.getSoluongdien()*this.getDongia();
		}
		else if(this.dinhmuc > this.getDinhmuc())
		{
			return this.getDinhmuc()*this.getSoluongdien()*this.getDongia()+(this.getSoluongdien()-this.getDinhmuc())*this.getDongia()*2;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "SinhHoat [dinhmuc=" + dinhmuc + ",makh=" + makh + ", tenkh=" + tenkh + ", ngayhoadon=" + this.getNgayhoadon() + ", soluongdien=" + soluongdien+", dongia=" + dongia + ",thanh tien= "+this.tinhtien()+"]";
	}
	
	public void nhapthongtin()
	{
		super.nhapthongtin();
		System.out.println("nhap dinh muc dien su dung:");
		dinhmuc = scanner.nextInt();
	}
	
	
}
























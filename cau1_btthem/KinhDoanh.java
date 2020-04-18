package cau1_btt;

public class KinhDoanh extends ABC
{

	@Override
	public long tinhtien() 
	{
		if(this.getSoluongdien()>400)
		{
			return this.getSoluongdien()*this.getDongia()*5/100;
		}
		return this.getSoluongdien()*this.getDongia();
	}
	
	public KinhDoanh(String makh,String tenkh,int ngayhoadon,int soluongdien,long dongia)
	{
		super(makh,tenkh,ngayhoadon,soluongdien,dongia);
	}
	
	public KinhDoanh(String makh,String tenkh,int soluongdien,long dongia)
	{
		super(makh,tenkh,soluongdien,dongia);
	}
	
	public  KinhDoanh() 
	{
		super();
	}

	@Override
	public String toString() {
		return "KinhDoanh [makh=" + makh + ", tenkh=" + tenkh + ", ngayhoadon=" + this.getNgayhoadon() + ", soluongdien=" + soluongdien +", dongia=" + dongia +",thanh tien= "+this.tinhtien()+"]";
	}
	
	@Override
	public void nhapthongtin()
	{
		super.nhapthongtin();
	}
	
}
















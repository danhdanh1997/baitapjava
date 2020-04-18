package cau2;

public class SachTieuThuyet extends Sach
{
	private boolean tinhtrang=true;
	
	public SachTieuThuyet(long masach, String tensach ,double dongia, int soluong, String nxb, boolean tinhtrang) {
		super(masach,tensach,dongia,soluong,nxb);
		this.tinhtrang = tinhtrang;
	}

	public SachTieuThuyet() {
		super();
	}

	public boolean getTinhtrang() {
		if(this.tinhtrang)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

	public void setTinhtrang(boolean tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	
	@Override
	public double thanhtien() 
	{
		if(this.getTinhtrang())
		{
			return this.soluong*this.dongia;
		}
		else 
		{
			return this.soluong*this.dongia*2/10;
		}
	}
	
	@Override
	public void thongtinsach()
	{
		
		super.thongtinsach();
		System.out.println("tinh trang sach:"+this.getTinhtrang());
	}
}















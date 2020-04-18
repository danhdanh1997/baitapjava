package cau2;

public class SachTrinhTham extends Sach
{
	private float thue;

	public SachTrinhTham() {
		super();
	}

	public SachTrinhTham(long masach,String tensach , double dongia , int soluong, String nxb, float thue) 
	{
		super(masach,tensach,dongia , soluong, nxb);
		this.thue = thue;
	}

	public float getThue() {
		return thue;
	}

	public void setThue(float thue) {
		this.thue = thue;
	}
	
	@Override
	public void thongtinsach()
	{
		super.thongtinsach();
		System.out.println("thue:"+this.getThue());
	}
	
	@Override
	public double thanhtien() 
	{
		return this.soluong*this.dongia+this.thue;
	}
}


















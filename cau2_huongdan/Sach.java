package cau2;

public class Sach 
{
	protected long masach;
	protected String tensach;
	protected double dongia;
	protected int soluong;
	protected String nxb;
	
	public Sach() {
		super();
	}

	public Sach(long masach, String tensach, double dongia, int soluong, String nxb) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.dongia = dongia;
		this.soluong = soluong;
		this.nxb = nxb;
	}

	public long getMasach() {
		return masach;
	}

	public void setMasach(long masach) {
		this.masach = masach;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	@Override
	public String toString() {
		return "Sach [masach=" + masach + ", tensach=" + tensach + ", dongia=" + dongia + ", soluong=" + soluong
				+ ", nxb=" + nxb + "]";
	}
	
	public void thongtinsach()
	{
		System.out.println("ma sach:"+masach);
		System.out.println("ten sach:"+tensach);
		System.out.println("don gia:"+dongia);
		System.out.println("so luong:"+soluong);
		System.out.println("nha xuat ban:"+nxb);
	}
	
	public double thanhtien()
	{
		return 1;
	}
	
}





























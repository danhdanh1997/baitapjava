package cau2_btt;

public class HangGiaDung extends HangHoa
{
	private String thongtinnhasx;
	private int ngaynhap;
	private String loai;
	
	public HangGiaDung() 
	{
		super();
	}

	public HangGiaDung(String thongtinnhasx, int ngaynhap, String loai)
	{
		super();
		this.thongtinnhasx = thongtinnhasx;
		this.ngaynhap = ngaynhap;
		this.loai = loai;
	}

	public String getThongtinnhasx() {
		return thongtinnhasx;
	}

	public void setThongtinnhasx(String thongtinnhasx) {
		this.thongtinnhasx = thongtinnhasx;
	}

	public int getNgaynhap() {
		return ngaynhap;
	}

	public void setNgaynhap(int ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	@Override
	public String toString() {
		return "HangGiaDung [thongtinnhasx=" + thongtinnhasx + ", ngaynhap=" + ngaynhap + ", loai=" + loai + "]";
	}

	@Override
	public void danhgia() 
	{
		System.out.println("nhap ngay hien tai:");
		int ngayhientai = scanner.nextInt();
		if(this.getSoluongton() >10)
		{
			if((ngayhientai - this.getNgaynhap())>20)
			{
				System.out.println("Ban cham:");
			}
		}
		else 
		{
			System.out.println("Ban duoc:");
		}
	}

	@Override
	public void tinhtien() 
	{
		System.out.println("nhap vao so luong hang ban duoc:");
		int n = scanner.nextInt();
		
		System.out.println("so tien thu lai duoc la:"+this.getDongia()*n*1/10);
		
		System.out.println("So hang con lai trong kho la:"+(this.getSoluongton()-n));
	}
	
	public boolean kiemtra(HangGiaDung hgd)
	{
		return super.kiemtra(hgd);
	}
}














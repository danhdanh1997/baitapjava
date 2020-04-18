package cau2_btt;

public class HangThucPham extends HangHoa
{
	private int ngaysanxuat;
	private boolean ngayhethan=false;
	private String nhacungcap;
	
	public HangThucPham() 
	{
		super();
	}

	public HangThucPham(String mahang, String tenhang, int soluongton, long dongia,int ngaysanxuat, boolean ngayhethan, String nhacungcap) 
	{
		super(mahang ,tenhang,soluongton,dongia);
		this.ngaysanxuat = ngaysanxuat;
		this.ngayhethan = ngayhethan;
		this.nhacungcap = nhacungcap;
	}

	public int getNgaysanxuat() {
		return ngaysanxuat;
	}

	public void setNgaysanxuat(int ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}

	public boolean getNgayhethan() {
		return ngayhethan;
	}

	public void setNgayhethan(boolean ngayhethan) {
		this.ngayhethan = ngayhethan;
	}

	public String getNhacungcap() {
		return nhacungcap;
	}

	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}

	
	@Override
	public String toString() {
		return "HangThucPham [ngaysanxuat=" + ngaysanxuat + ", ngayhethan=" + ngayhethan + ", nhacungcap=" + nhacungcap
				+ "]";
	}

	
	@Override
	public void danhgia() 
	{
		if(this.getNgayhethan()==true && this.getSoluongton() >2)
		{
			System.out.println("hang kho ban:");
		}
		System.out.println("hang de ban:");
	}

	@Override
	public void tinhtien()
	{
		System.out.println("nhap vao so luong hang ban duoc:");
		int n = scanner.nextInt();
		
		System.out.println("so tien thu lai duoc la:"+this.getDongia()*n*5/10);
		
		System.out.println("So hang con lai trong kho la:"+(this.getSoluongton()-n));
	}
	
	public boolean kiemtra(HangThucPham htp)
	{
		return super.kiemtra(htp);
	}
	
}

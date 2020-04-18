package cau2_p2;

public class ChuyenXeNgoaiThanh extends ChuyenXe
{
	private String noiden;
	private int songayvanchuyen;
	
	
	public ChuyenXeNgoaiThanh() {
		super();
	}


	public ChuyenXeNgoaiThanh(int masochuyen, String ten, String soxe,int khoiluong, String noiden, int songayvanchuyen) {
		super(masochuyen,ten,soxe,khoiluong);
		this.noiden = noiden;
		this.songayvanchuyen = songayvanchuyen;
	}


	public String getNoiden() {
		return noiden;
	}


	public void setNoiden(String noiden) {
		this.noiden = noiden;
	}


	public int getSongayvanchuyen() {
		return songayvanchuyen;
	}


	public void setSongayvanchuyen(int songayvanchuyen) {
		this.songayvanchuyen = songayvanchuyen;
	}


	@Override
	public String toString() {
		return "ChuyenXeNgoaiThanh [noiden=" + noiden + ", songayvanchuyen=" + songayvanchuyen + "masochuyen=" + masochuyen + ", ten=" + ten + ", soxe=" + soxe + ", khoiluong=" + khoiluong+"]";
	}
	
	@Override
	public double tinhdoanhthu()
	{
		return this.songayvanchuyen*this.khoiluong;
	}
	
	@Override
	public void nhapthongtin()
	{
		super.nhapthongtin();
		
		System.out.println("nhap vao noi den cua xe:");
		noiden = scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.println("nhap vao so ngay van chuyen cua xe:");
		songayvanchuyen = scanner.nextInt();
	}
}













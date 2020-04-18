package cau2_p2;

public class ChuyenXeNoiThanh extends ChuyenXe
{
	private int quangduongdi;

	public ChuyenXeNoiThanh() {
		super();
	}

	public ChuyenXeNoiThanh(int masochuyen, String ten, String soxe,int khoiluong,int quangduongdi) {
		super(masochuyen,ten,soxe,khoiluong);
		this.quangduongdi = quangduongdi;
	}

	public int getQuangduongdi() {
		return quangduongdi;
	}

	public void setQuangduongdi(int quangduongdi) {
		this.quangduongdi = quangduongdi;
	}

	@Override
	public String toString() {
		return "ChuyenXeNoiThanh [quangduongdi=" + quangduongdi + ",masochuyen=" + masochuyen + ", ten=" + ten + ", soxe=" + soxe + ", khoiluong=" + khoiluong+"]";
	}
	
	@Override
	public double tinhdoanhthu()
	{
		return this.quangduongdi*this.khoiluong;
	}
	
	public void nhapthongtin()
	{
		super.nhapthongtin();
		
		System.out.println("nhap vao quang duong di  cua xe:");
		quangduongdi = scanner.nextInt();
	}
}















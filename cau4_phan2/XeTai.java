package cau4_p2;

public class XeTai extends Xe
{

	private int khoiluonghangthem;
	private int khoiluonghangbot;
	private int xangthem;
	private int quangduongxechay;
	
	@Override
	public int themmotluonghang() 
	{
		return this.getKhoiluong()+this.getKhoiluonghangthem();
	}

	@Override
	public int botmotluonghang()
	{
		return this.getKhoiluong()-this.getKhoiluonghangthem();
	}

	@Override
	public int domotluongxang() 
	{
		return this.getSolitxang()+this.getXangthem();
	}

	@Override
	public int choxechaymotdoanduong()
	{
		return this.getQuangduongxechay();
	}

	@Override
	public boolean kiemtraxang()
	{
		int tongxang=this.getSolitxang()+this.getXangthem();
		if(tongxang > this.tinhluongxangkhidiquanduongvathemmoikhoiluonghang())
		{
			return true;
		}
		
		return false;
	}

	@Override
	public int luongxangconlai()
	{
		return this.getSolitxang()+this.getXangthem()-this.tinhluongxangkhidiquanduongvathemmoikhoiluonghang();
	}

	public XeTai() {
		super();
	}

	public XeTai(int solitxang,int khoiluong,int khoiluonghangthem, int khoiluonghangbot, int xangthem, int quangduongxechay) {
		super(solitxang,khoiluong);
		this.khoiluonghangthem = khoiluonghangthem;
		this.khoiluonghangbot = khoiluonghangbot;
		this.xangthem = xangthem;
		this.quangduongxechay = quangduongxechay;
	}

	public int getKhoiluonghangthem() {
		return khoiluonghangthem;
	}

	public void setKhoiluonghangthem(int khoiluonghangthem) {
		this.khoiluonghangthem = khoiluonghangthem;
	}

	public int getKhoiluonghangbot() {
		return khoiluonghangbot;
	}

	public void setKhoiluonghangbot(int khoiluonghangbot) {
		this.khoiluonghangbot = khoiluonghangbot;
	}

	public int getXangthem() {
		return xangthem;
	}

	public void setXangthem(int xangthem) {
		this.xangthem = xangthem;
	}

	public int getQuangduongxechay() {
		return quangduongxechay;
	}

	public void setQuangduongxechay(int quangduongxechay) {
		this.quangduongxechay = quangduongxechay;
	}

	public int tinhluongxangkhidiquanduongvathemmoikhoiluonghang()
	{
		return this.getQuangduongxechay()*20/100+this.getKhoiluonghangthem()*1/100;
	}
}














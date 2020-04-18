package cau4_p2;

public abstract class Xe 
{
	protected int solitxang;
	protected int khoiluong;
	
	public Xe() {
		super();
	}

	public Xe(int solitxang, int khoiluong) {
		super();
		this.solitxang = solitxang;
		this.khoiluong = khoiluong;
	}

	public int getSolitxang() {
		return solitxang;
	}

	public void setSolitxang(int solitxang) {
		this.solitxang = solitxang;
	}

	public int getKhoiluong() {
		return khoiluong;
	}

	public void setKhoiluong(int khoiluong) {
		this.khoiluong = khoiluong;
	}
	
	public abstract int themmotluonghang();
	
	public abstract int botmotluonghang();
	
	public abstract int domotluongxang();
	
	public abstract int choxechaymotdoanduong();
	
	public abstract boolean kiemtraxang();
	
	public abstract int luongxangconlai();
}













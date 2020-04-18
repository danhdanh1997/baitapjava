package cau3_p2;

public class Pedion extends RoBot
{
	private int F;
	private int tongnangluongpedion;
	public int getF() {
		return (int) ((Math.random()*(4))+1);
	}


	public void setF(int f) {
		F = f;
	}
	
	
	public Pedion(int m,int s)
	{
		super(m,s);
	}


	@Override
	public int tinhnangluon()
	{
		return 20*this.getS()+(this.getF()+1)*this.getS()/2;
	}


	@Override
	public String toString() {
		return "Pedion [F=" + this.getF() + ",M= "+20+",S="+20+ ",nang luong="+this.tinhnangluon()+"]";
	}


	public int getTongnangluongpedion() {
		return tongnangluongpedion;
	}


	public void setTongnangluongpedion(int tongnangluongpedion) {
		this.tongnangluongpedion = tongnangluongpedion;
	}

	//: M*S+(F+1)*S/2.
	
	
}














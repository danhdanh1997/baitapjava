package cau3_p2;

public class Carrier extends RoBot
{
	private int E;

	public Carrier(int m,int s) {
		super(m,s);
	}

	public int getE() {
		return (int) ((Math.random()*(50))+50);
	}

	public void setE(int e) {
		E = e;
	}

	@Override
	public int tinhnangluon()
	{
		return 30*this.getS()+4*this.getE()*this.getS();
	}
	//• Carrier: M*S+4*E*S.

	@Override
	public String toString() {
		return "Carrier [E=" + this.getE() +",M= "+20+",S="+20+ ",nang luong="+this.tinhnangluon()+ "]";
	}
	
	
}

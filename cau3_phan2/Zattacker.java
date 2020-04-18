package cau3_p2;

public class Zattacker extends RoBot
{
	private int P;

	public Zattacker(int m,int s) 
	{
		super(m,s);
	}

	public int getP() {
		return (int) ((Math.random()*(10))+20);
	}

	public void setP(int p) {
		P = p;
	}

	@Override
	public int tinhnangluon() 
	{
		return 50*this.getS()+this.getP()*this.getP()*this.getS();
	}
	//• Zattacker: M*S+P*P*S.

	@Override
	public String toString() {
		return "Zattacker [P=" + this.getP()+",M= "+20+",S="+20+ ",nang luong="+this.tinhnangluon() + "]";
	}
	
	
}










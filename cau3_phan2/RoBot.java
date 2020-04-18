package cau3_p2;

public abstract class RoBot 
{
	protected int M;
	protected int S;
	public RoBot(int m,int s)
	{
		super();
		M = m;
		S=s;
	}

	public RoBot()
	{
		super();
	}

	public int getS() {
		return S;
	}

	public void setS(int s) {
		S = s;
	}
	
	public abstract int tinhnangluon();
	
}

package cau1;

public class TaiKhoang
{
	private long stk;
	private String tentk;
	private double sotientk;
	
	
	public TaiKhoang() {
		super();
	}


	public TaiKhoang(long stk, String tentk, double sotientk) {
		super();
		this.stk = stk;
		this.tentk = tentk;
		this.sotientk = sotientk;
	}


	public long getStk() {
		return stk;
	}


	public void setStk(long stk) {
		this.stk = stk;
	}


	public String getTentk() {
		return tentk;
	}


	public void setTentk(String tentk) {
		this.tentk = tentk;
	}


	public double getSotientk() {
		return sotientk;
	}


	public void setSotientk(double sotientk) {
		this.sotientk = sotientk;
	}


	@Override
	public String toString() {
		return "TaiKhoang [stk=" + stk + ", tentk=" + tentk + ", sotientk=" + sotientk + "]";
	}
	
	public boolean naptientaikhoang(double st)
	{
		if(stk > 0)
		{
			 sotientk+=st;
			 return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean chuyenkhoang(TaiKhoang a, double st)
	{
		if(this.sotientk < st)
		{
			return false;
		}
		
		else 
		{
			a.sotientk+=st;
			this.sotientk-=st;
			return true;
		}
	}
}




























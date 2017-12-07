package revenue;

public class Revenue {
	public int monthly_revenue;
	public double ratio;
	
	
	public Revenue(int monthly_revenue,double ratio) {
		super();
		this.monthly_revenue=monthly_revenue;
		this.ratio=ratio;
		
	}
	public Revenue(int monthly_revenue) {
		super();
		this.monthly_revenue=monthly_revenue;
		this.ratio=1;
		
	}
	
	public int effective_revenue() {
		double result=0;
		result=this.monthly_revenue*this.ratio;
		
		return (int) (result);
	}

}

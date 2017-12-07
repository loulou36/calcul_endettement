package revenue;

public class revenue {
	public int monthly_revenue;
	public float ratio;
	
	
	public revenue(int monthly_revenue,float ratio) {
		super();
		this.monthly_revenue=monthly_revenue;
		this.ratio=ratio;
		
	}
	public revenue(int monthly_revenue) {
		super();
		this.monthly_revenue=monthly_revenue;
		this.ratio=1;
		
	}

}

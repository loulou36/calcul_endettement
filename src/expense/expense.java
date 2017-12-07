package expense;

public class expense {
public int monthly_expense;
public boolean appliable_after_mortgage;

	public expense(int monthly_expense,boolean appliable_after_mortgage) {
		super();
		this.monthly_expense=monthly_expense;
		this.appliable_after_mortgage=appliable_after_mortgage;
	}
	
	public expense(int monthly_expense) {
		super();
		this.monthly_expense=monthly_expense;
		this.appliable_after_mortgage=true;
	}
}

package expense;

public class Expense {
public int monthly_expense;
public boolean appliable_after_mortgage;

	public Expense(int monthly_expense,boolean appliable_after_mortgage) {
		// if appliable_after_mortgage is set to false the expense won't be taken into account (as rent when you're getting a mortgage for a house it won't be integrated to calculate you're debt ratio)
		super();
		this.monthly_expense=monthly_expense;
		this.appliable_after_mortgage=appliable_after_mortgage;
	}
	
	public Expense(int monthly_expense) {
		// in most cases if appliable_after_mortgage is not set so better have this second constructor 
		super();
		this.monthly_expense=monthly_expense;
		this.appliable_after_mortgage=true;
	}
}

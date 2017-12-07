package person;

import java.util.ArrayList;

import expense.expense;
import revenue.revenue;

public class person {
	public int id;
	public String name;
	public ArrayList<expense> expenses = new ArrayList<>();
	public ArrayList<revenue> revenues = new ArrayList<>();
	
	
	public person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int revenues_monthly() {
		int result = 0;
		for (int i = 0; i<revenues.size();i++)
		{
			result= result + revenues.get(i).monthly_revenue;
		}
		return result;
	}
	
	public int expenses_monthly() {
		int result = 0;
		for (int i = 0; i<expenses.size();i++)
		{
			result= result + expenses.get(i).monthly_expense * ((expenses.get(i).appliable_after_mortgage) ? 1 : 0);
		}
		return result;
	}
	
	public float debt_ratio() {
		float ratio = 0;
		ratio = this.expenses_monthly()/this.revenues_monthly();
		return ratio;
	}
	
	
	

}

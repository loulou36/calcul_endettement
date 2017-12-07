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
	
	public double expenses_monthly() {
		double result = 0;
		for (int i = 0; i<expenses.size();i++)
		{
			result= result + expenses.get(i).monthly_expense;
		}
		return result;
	}
	
	public float debt_ratio() {
		float ratio = 0;
		
		return ratio;
	}
	
	
	

}

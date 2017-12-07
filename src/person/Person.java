package person;

import java.util.ArrayList;

import expense.Expense;
import revenue.Revenue;

public class Person {
	//a person is defined by an id and a name in this case 
	//a person can have expenses and revenues
	public int id;
	public String name;
	public ArrayList<Expense> expenses = new ArrayList<>();
	public ArrayList<Revenue> revenues = new ArrayList<>();	
	
	public Person(int id, String name, ArrayList<Expense> expenses, ArrayList<Revenue> revenues) {
		super();
		this.id = id;
		this.name = name;
		this.expenses = expenses;
		this.revenues = revenues;
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
	
	public int debt_ratio() {
		double ratio = 0;
		ratio = (double) (this.expenses_monthly()) / (double) (this.revenues_monthly());
		return (int) (ratio*100);
	}
	
	
	public static void main(String[] args) {
		System.out.println("a sample to check this project out ");
		
		Expense rent = new Expense(2000,false);
		Expense mortgage = new Expense(1000);
		
		Revenue salary = new Revenue(5000);
		Revenue extra_income = new Revenue(1000,0.8);
		
		ArrayList<Expense> expenses = new ArrayList<>();
		ArrayList<Revenue> revenues = new ArrayList<>();
		
		expenses.add(rent);
		expenses.add(mortgage);
		
		revenues.add(salary);
		revenues.add(extra_income);
		
		Person loulou = new Person(0, "louloute", expenses, revenues);
		
		System.out.println(loulou.name+" is having the following debt_ratios : "+loulou.debt_ratio());
		System.out.println(loulou.name+" is having the following incomes : "+loulou.revenues_monthly());
		System.out.println(loulou.name+" is having the following effective expenses : "+loulou.expenses_monthly());
	}

}

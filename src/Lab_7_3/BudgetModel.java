package Lab_7_3;

public class BudgetModel {
    private double income;
    private double expenses;

    public BudgetModel(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
    }

    public double getIncome() { return income; }
    public double getExpenses() { return expenses; }
    public double getBalance() { return income - expenses; }

    public void setIncome(double income) { this.income = income; }
    public void setExpenses(double expenses) { this.expenses = expenses; }
}


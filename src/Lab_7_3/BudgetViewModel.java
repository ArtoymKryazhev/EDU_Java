package Lab_7_3;

public class BudgetViewModel {
    private final BudgetModel model = new BudgetModel(0, 0);

    // Observable-состояния (имитация binding)
    public final SimpleObservable<Double> income = new SimpleObservable<>();
    public final SimpleObservable<Double> expenses = new SimpleObservable<>();
    public final SimpleObservable<Double> balance = new SimpleObservable<>();

    public BudgetViewModel() {
        // Начальные значения
        updateAll();
    }

    public void addIncome(double amount) {
        model.setIncome(model.getIncome() + amount);
        updateAll();
    }

    public void addExpense(double amount) {
        model.setExpenses(model.getExpenses() + amount);
        updateAll();
    }

    private void updateAll() {
        income.setValue(model.getIncome());
        expenses.setValue(model.getExpenses());
        balance.setValue(model.getBalance());
    }
}


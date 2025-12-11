package Lab_7_3;

public class BudgetView {
    public BudgetView(BudgetViewModel viewModel) {
        // Подписка на изменения (binding)
        viewModel.income.addObserver(this::onIncomeChanged);
        viewModel.expenses.addObserver(this::onExpensesChanged);
        viewModel.balance.addObserver(this::onBalanceChanged);
    }

    private void onIncomeChanged(Double income) {
        System.out.printf("💰 Доход: %.2f₽\n", income);
    }

    private void onExpensesChanged(Double expenses) {
        System.out.printf("💸 Расходы: %.2f₽\n", expenses);
    }

    private void onBalanceChanged(Double balance) {
        System.out.printf("💳 Баланс: %.2f₽\n", balance);
        System.out.println("─".repeat(30));
    }
}


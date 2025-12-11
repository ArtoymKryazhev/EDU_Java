package Lab_7_3;

public class MainMVVM {
    public static void main(String[] args) {
        BudgetViewModel viewModel = new BudgetViewModel();
        BudgetView view = new BudgetView(viewModel);

        System.out.println("=== MVVM Управление бюджетом ===\n");

        // Имитация событий пользователя
        viewModel.addIncome(50000);    // Зарплата
        viewModel.addExpense(15000);   // Еда
        viewModel.addIncome(10000);    // Фриланс
        viewModel.addExpense(5000);    // Транспорт
    }
}


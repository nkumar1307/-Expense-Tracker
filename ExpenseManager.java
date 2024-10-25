import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public double getTotalExpenditure() {
        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    // Additional methods for filtering expenses, updating, and deleting
}

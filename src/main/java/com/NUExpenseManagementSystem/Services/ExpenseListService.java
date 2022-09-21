package com.NUExpenseManagementSystem.Services;


import com.NUExpenseManagementSystem.Models.ExpenseInfoModel;
import com.NUExpenseManagementSystem.Models.ExpenseListModel;

import java.util.List;

public interface ExpenseListService {
	
	public List<ExpenseListModel> getExpenseLists();
	
	public ExpenseListModel getExpenseList(long searchId);
	
	public ExpenseListModel registerExpenseList(ExpenseListModel expenseListModel);
	
	public ExpenseListModel updateExpenseList(ExpenseListModel expenseListModel);

	public ExpenseListModel deleteExpenseList(Long searchId);
}

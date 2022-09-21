package com.NUExpenseManagementSystem.Controllers;

import com.NUExpenseManagementSystem.Models.ExpenseInfoModel;
import com.NUExpenseManagementSystem.Models.ExpenseListModel;
import com.NUExpenseManagementSystem.Services.ExpenseListService;
import com.NUExpenseManagementSystem.Services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="/api/expense-list")
public class ExpenseListController {
	
	@Autowired
	private ExpenseListService expenseListService;
	
	@GetMapping("/search")
	public List<ExpenseListModel> getExpense() {
		return this.expenseListService.getExpenseLists();
	}
	
	@GetMapping("/search/{searchId}")
	public ExpenseListModel getExpenseList(@PathVariable String searchId) {
		return this.expenseListService.getExpenseList(Long.parseLong(searchId));
	}
	
	@PostMapping("/register")
	public ExpenseListModel registerExpense(@RequestBody ExpenseListModel expenseListModel) {
		return this.expenseListService.registerExpenseList(expenseListModel);
	}
	
	@PutMapping("/search/{searchId}")
	public ExpenseListModel updateExpense(@RequestBody ExpenseListModel expenseListModel) {
		return this.expenseListService.updateExpenseList(expenseListModel);
	}

	@DeleteMapping("/search/{searchId}")
	public ExpenseListModel deleteExpenseList(@PathVariable String searchId) {
		return this.expenseListService.deleteExpenseList(Long.parseLong(searchId));
	}
	
}

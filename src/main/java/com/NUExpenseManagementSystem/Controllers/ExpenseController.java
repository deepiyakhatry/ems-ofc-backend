package com.NUExpenseManagementSystem.Controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.NUExpenseManagementSystem.Models.ExpenseInfoModel;
import com.NUExpenseManagementSystem.Services.ExpenseService;

@CrossOrigin
@RestController
@RequestMapping(value="/api/expense")
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/search")
	public List<ExpenseInfoModel> getExpense() {
		return this.expenseService.getExpense();
	}
	
	@GetMapping("/search/{searchId}")
	public ExpenseInfoModel getExpenseList(@PathVariable String searchId) {
		return this.expenseService.getExpenseData(Long.parseLong(searchId));
	}
	
	@PostMapping("/register")
	public ExpenseInfoModel registerExpense(@RequestBody ExpenseInfoModel expenseInfoModel) {
		return this.expenseService.registerExpense(expenseInfoModel);
	}
	
	@PutMapping("/search/{searchId}")
	public ExpenseInfoModel updateExpense(@RequestBody ExpenseInfoModel expenseInfoModel) {
		return this.expenseService.updateExpense(expenseInfoModel);
	}

	@DeleteMapping("/search/{searchId}")
	public ExpenseInfoModel deleteExpense(@PathVariable String searchId) {
		return this.expenseService.deleteExpense(Long.parseLong(searchId));
	}
	
}

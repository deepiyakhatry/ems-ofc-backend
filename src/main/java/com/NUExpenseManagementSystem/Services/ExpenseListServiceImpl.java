package com.NUExpenseManagementSystem.Services;

import com.NUExpenseManagementSystem.Models.ExpenseListModel;
import com.NUExpenseManagementSystem.Repository.ExpenseListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseListServiceImpl implements ExpenseListService {
	
	@Autowired
	private ExpenseListRepository expenseListRepository;
	
	@Override
	public List<ExpenseListModel> getExpenseLists() {
		return expenseListRepository.findAll();
	}
	
	@Override
	public ExpenseListModel getExpenseList(long searchId) {
		return expenseListRepository.findById(searchId).get();
	
	}
	
	@Override
	public ExpenseListModel registerExpenseList(ExpenseListModel expenseListModel) {
		expenseListRepository.save(expenseListModel);
		return expenseListModel;
	}
	
	@Override
	public ExpenseListModel updateExpenseList(ExpenseListModel expenseListModel) {
		expenseListRepository.save(expenseListModel);
		return expenseListModel;
	}

	@Override
	public ExpenseListModel deleteExpenseList(Long searchId) {
		expenseListRepository.deleteById(searchId);
		return null;
	}
	
}

	
	 

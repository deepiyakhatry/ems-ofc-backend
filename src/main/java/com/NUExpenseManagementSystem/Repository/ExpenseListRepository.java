package com.NUExpenseManagementSystem.Repository;

import com.NUExpenseManagementSystem.Models.ExpenseInfoModel;
import com.NUExpenseManagementSystem.Models.ExpenseListModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseListRepository extends JpaRepository<ExpenseListModel, Long>{

}
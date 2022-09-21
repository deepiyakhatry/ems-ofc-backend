package com.NUExpenseManagementSystem.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table (name="ExpenseList")
public class ExpenseListModel {
	
	
	@Id
	@GeneratedValue
	
	private long id;
    private String employee_no;
    private String full_name;
    private String application_date_from;
    private String application_date_to;
    private String approval_month_from;
    private String approval_month_to;
    private String payment_date_from;
    private String payment_date_to;
    private String approval_status;

}
    

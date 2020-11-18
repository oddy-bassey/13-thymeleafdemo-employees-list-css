package com.revoltcode.springboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revoltcode.springboot.thymeleaf.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	//load employee data
	private List<Employee> employees;
	
	@PostConstruct
	private void loadData() {
		
		//create employees
		Employee employee1 = new Employee(1, "Lelslie","Vardy", "leslieVardy@gmail.com");
		Employee employee2 = new Employee(2, "Ade","Dayo", "adedayo@gmail.com");
		Employee employee3 = new Employee(3, "Ayo","Bami", "ayobami@gmail.com");
		Employee employee4 = new Employee(4, "Timi","Dakolo", "timidakolo@gmail.com");
		Employee employee5 = new Employee(5, "Kunle","Olunrunmi", "kunleolurunmi@gmail.com");

		//create the list
		employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		//add to the list
	}
	
	//add a mapping for '/list'
	@GetMapping("/list")
	public String listEmployees(Model model) {
		
		//add to the spring model
		model.addAttribute("employees", employees);
		
		return "list-employees";
	}

}



















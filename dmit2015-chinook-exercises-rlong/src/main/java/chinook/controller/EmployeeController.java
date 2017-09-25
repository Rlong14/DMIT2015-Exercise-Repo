package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.EmployeeRepository;
import chinook.model.Employee;

@Model
public class EmployeeController {
		
		@Inject
		private EmployeeRepository EmployeeRepository;
		
		//private List<Employee> Employees; //getter
		
		//@PostConstruct
		//void init() {
		//	Employees = EmployeeRepository.findAll();
		//}

		public List<Employee> getEmployees() {
			//return Employees;
			return EmployeeRepository.findAll();
		}
		
		public List<Employee> retrieveAllEmployees(){
			return EmployeeRepository.findAll();
		}
}

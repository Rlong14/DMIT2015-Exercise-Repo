package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.CustomerRepository;
import chinook.model.Customer;

@Model
public class CustomerController {
		
		@Inject
		private CustomerRepository CustomerRepository;
		
		//private List<Customer> Customers; //getter
		
		//@PostConstruct
		//void init() {
		//	Customers = CustomerRepository.findAll();
		//}

		public List<Customer> getCustomers() {
			//return Customers;
			return CustomerRepository.findAll();
		}
		
		public List<Customer> retrieveAllCustomers(){
			return CustomerRepository.findAll();
		}
}

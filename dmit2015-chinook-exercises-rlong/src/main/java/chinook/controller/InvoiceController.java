package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.InvoiceRepository;
import chinook.model.Invoice;

@Model
public class InvoiceController {
		
		@Inject
		private InvoiceRepository InvoiceRepository;
		
		//private List<Invoice> Invoices; //getter
		
		//@PostConstruct
		//void init() {
		//	Invoices = InvoiceRepository.findAll();
		//}

		public List<Invoice> getInvoices() {
			//return Invoices;
			return InvoiceRepository.findAll();
		}
		
		public List<Invoice> retrieveAllInvoices(){
			return InvoiceRepository.findAll();
		}
}

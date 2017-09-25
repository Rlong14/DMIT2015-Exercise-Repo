package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.InvoiceLineRepository;
import chinook.model.InvoiceLine;

@Model
public class InvoiceLineController {
		
		@Inject
		private InvoiceLineRepository InvoiceLineRepository;
		
		//private List<InvoiceLine> InvoiceLines; //getter
		
		//@PostConstruct
		//void init() {
		//	InvoiceLines = InvoiceLineRepository.findAll();
		//}

		public List<InvoiceLine> getInvoiceLines() {
			//return InvoiceLines;
			return InvoiceLineRepository.findAll();
		}
		
		public List<InvoiceLine> retrieveAllInvoiceLines(){
			return InvoiceLineRepository.findAll();
		}
}

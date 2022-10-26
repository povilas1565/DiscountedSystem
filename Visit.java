package discountsystem.core;

import java.util.Date;

public class Visit{
	Customer customer;
	Date visitDate;
	double productBill;
	
	public Visit(Customer customer, Date visitDate, double productBill){
		this.customer = customer;
		this.visitDate = visitDate;
		this.productBill = productBill;
	}
	
	public Customer getCustomer(){
		return customer;
	}

	public Date getVisitDate(){
		return visitDate;
	}

	public double getProductBill(){
		return productBill;
	}


	public double getFinalBill(){
		DiscountedBill productDiscount = new ProductDiscountedBill();
		
		return productDiscount.getDiscountedBill(this.productBill, this.getCustomer().getMemberType());
	}
}

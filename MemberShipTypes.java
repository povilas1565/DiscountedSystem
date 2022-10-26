package discountsystem.core;


public enum MemberShipTypes{
	// Initialise all membership types with product discounts of 30%
	PREMIUM(30), GOLD(30), SILVER(30), NONE(30);
	double productDiscount;

	private MemberShipTypes(double productDiscount){
		this.productDiscount = productDiscount;
	}


	public double getProductDiscount(){
		return productDiscount;
	}

	public void setProductDiscount(double productDiscount){
		this.productDiscount = productDiscount;
	}
}

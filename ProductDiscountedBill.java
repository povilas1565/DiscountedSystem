package discountsystem.core;

public class ProductDiscountedBill implements DiscountedBill{
	@Override
	public double getDiscountedBill(double productBill, MemberShipTypes membershipType){
		return productBill - productBill*membershipType.getProductDiscount();
	}
}

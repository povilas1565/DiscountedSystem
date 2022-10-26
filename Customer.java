package discountsystem.core;

/**
 * This class defines the customer - name and his/her membership type
 * @author jhaverih
 *
 */
public class Customer{
	private String name;
	private MemberShipTypes memberType;
	
	public Customer(String name, MemberShipTypes memberType){
		this.name = name;
		this.memberType = memberType;
	}
		
	public MemberShipTypes getMemberType(){
		return memberType;
	}
	
	public void setMemberType(MemberShipTypes memberType){
		this.memberType = memberType;
	}

	public String getName(){
		return name;
	}
	

	public boolean isMember(){
		return !this.memberType.equals(MemberShipTypes.NONE);
	}
}

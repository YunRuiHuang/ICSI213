package BinarySearchTree;
/**
 * 
 * @author yunrui Huang
 *
 */
public class Address {

	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	Address(String street, String city, String state, String zipcode){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	/**
	 * return full address information
	 * @return address
	 */
	public String getAddress() {
		return street+" "+city+" "+state+" "+zipcode;
	}
}

package BinarySearchTree;
/**
 * 
 * @author yunrui Huang
 *
 */
public class Contact implements java.lang.Comparable<E>{
	private Address address;
	private String phone;
	private String name;
	
	Contact(String name){
		this(name,null,null,null,null,null);
	}
	Contact(String name,String street, String city, String state, String zipcode, String phone){
		this.name = name;
		this.phone = phone;
		this.address = new Address(street,city,state,zipcode);
	}
/**
 * get the name
 * @return the name
 */
	public String getName() {
		return this.name;
	}
	/**
	 * get the phone number
	 * @return the phone number
	 */
	public String getPhone() {
		return this.phone;
	}
	/**
	 * get the address information
	 * @return the address
	 */
	public String getAddress() {
		return this.address.getAddress();
	}
	/**
	 * print all information
	 * @return name,address,and phone number
	 */
	public String print() {
		return this.name+" "+this.address.getAddress()+" "+this.phone;
	}

	@Override
	/**
	 * compare two name
	 * @param element another name
	 * @return if less return -1, equal return 0, and large return 1
	 */
	public int compareTo(Contact element) {
		if(this.name.compareTo(element.getName())<0) {
			return -1;
		}else if(this.name.compareTo(element.getName())==0) {
			return 0;
		}else {
			return 1;
		}
	}
}

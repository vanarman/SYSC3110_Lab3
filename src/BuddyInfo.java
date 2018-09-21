
public class BuddyInfo {
	
	private String name;
	private String address;
	private String phoneNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		BuddyInfo name = new BuddyInfo();
		name.setName("sljkdfgh");
		System.out.println(name.getName());
	}
	
	public BuddyInfo() {
		this.name = null;
		this.address = null;
		this.phoneNumber = null;
	}
	
	public BuddyInfo(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNUmber() {
		return phoneNumber;
	}

	public void setPhoneNUmber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

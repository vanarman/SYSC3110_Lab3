import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddys;
	
	public AddressBook() {
		buddys = new ArrayList<BuddyInfo>();
	}

	public void createBuddy(BuddyInfo buddy) {
		if(buddy != null) {
			buddys.add(buddy);
		} 

	}
	
	public boolean removeBuddy(int index) {
		if(index >= 0 && index <= buddys.size()) {
			buddys.remove(index);
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book Class");
		
		AddressBook newABook = new AddressBook();
		
		BuddyInfo buddy1 = new BuddyInfo("Jhon", "Ottawa", "6138989890");
		newABook.createBuddy(buddy1);
		newABook.removeBuddy(0);
		
	}
	
}

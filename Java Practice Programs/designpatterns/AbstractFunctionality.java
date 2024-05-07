package Java.designpatterns;

public class AbstractFunctionality {
	public static void main(String[] args) {
		AbstractFunctionality1 s = new AbstractExtends();
		s.addUser();
		s.deleteUser();
		s.updateUser();
		s.editUser();
		s.entryInExternalTable();
		
	}
}

class AbstractExtends extends AbstractFunctionality1 {
	@Override
	public void entryInExternalTable() {
		System.out.println("Entry added successfully !!");
	}
}

abstract class AbstractFunctionality1 implements StoreUserInformation {

	private User user =  new User(1l, "Sreenivasulu", 29, "8341408805");

	public AbstractFunctionality1() {
		super();
	}

	@Override
	public void addUser() {
		System.out.println("Add User " + user.getUserId());
	}

	@Override
	public void deleteUser() {
		System.out.println("Delete User " + user.getUserId());
	}

	@Override
	public void editUser() {
		System.out.println("Edit User " + user.getUserId());
	}

	@Override
	public void updateUser() {
		System.out.println("Update User " + user.getUserId());
	}

}

interface StoreUserInformation {

	void addUser();

	void updateUser();

	void deleteUser();

	void editUser();

	void entryInExternalTable();
}

class User {
	private long userId;
	private String name;
	private int age;
	private String mobileNumber;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public User(long userId, String name, int age, String mobileNumber) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}
}
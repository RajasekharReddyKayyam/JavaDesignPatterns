package CreationalDesignPattern;

public class User {
	private String name;
	private String location;
	private Long contactnumber;
	public User(String name, String location, Long contactnumber) {
		super();
		this.name = name;
		this.location = location;
		this.contactnumber = contactnumber;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", location=" + location + ", contactnumber=" + contactnumber + ", getName()="
				+ getName() + ", getLocation()=" + getLocation() + ", getContactnumber()=" + getContactnumber()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}

}

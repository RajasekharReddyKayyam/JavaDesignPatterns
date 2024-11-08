package CreationalDesignPattern;

public class UserBuilder {
    private String name;           // Required
    private String location;       // Optional
    private Long contactnumber;    // Optional

    public UserBuilder(String name) {
        this.name = name;          // Name is required
    }

    public UserBuilder() {
		// TODO Auto-generated constructor stub
	}

	public UserBuilder setlocation(String location) {
        this.location = location;   // Set the location
        return this;                // Return the builder for chaining
    }

    public UserBuilder setcontactnumber(Long contactnumber) {
        this.contactnumber = contactnumber; // Set the contact number
        return this;                          // Return the builder for chaining
    }
    public UserBuilder setname(String name) {
    	this.name=name;
    	return this;
    }

    public User getuser() {
        return new User(name, location, contactnumber); // Construct the User object
    }
}

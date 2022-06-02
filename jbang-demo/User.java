//SOURCES UserAddress.java

public class User {
    public long id;
    public String firstName;
    public String lastName;
    public UserAddress userAddress;

    public User() {
        this.userAddress = new UserAddress();
        this.userAddress.id = 1;
        this.userAddress.userId = this.id;
        this.userAddress.address = "Some address";
    }

    public String toString() {
        return id + ", " + firstName + ", " + lastName + ", " + userAddress;
    }
}
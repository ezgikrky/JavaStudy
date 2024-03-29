public class User {
    private int id;
    private String FirstName;
    private String LastName;
    private String Email;

    public User() {
    }


    public User(int id, String firstName, String lastName, String email) {
        this();
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

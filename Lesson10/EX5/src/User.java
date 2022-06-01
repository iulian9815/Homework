import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName==null|| firstName==" ") {
            this.firstName = "";
        }
        else
            this.firstName=firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null){
        this.lastName = "";
    }
        else
            this.lastName=lastName;
    }

    public String getName() {
        return this.firstName.concat(" "+this.lastName);
    }
}

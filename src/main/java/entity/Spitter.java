package entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author tanjie
 * @date 2018-07-04
 */
public class Spitter {
    @NotNull
    @Size(min = 5, max = 16 ,message = "size error")
    private String firstName;
    @NotNull
    @Size(min = 5, max = 16)
    private String lastName;
    @NotNull
    @Size(min = 5, max = 16)
    private String username;
    @NotNull
    @Size(min = 5, max = 16)
    private String password;

    public Spitter(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Spitter() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

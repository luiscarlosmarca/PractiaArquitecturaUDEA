package co.edu.udea.microservicioudearegistration.dto;

public class Contact {

    private Long id;
    private String fistname;
    private String Lastname;
    private String phoneNumber;
    private String email;

    public Contact(Long id, String fistname, String lastname, String phoneNumber, String email) {
        this.id = id;
        this.fistname = fistname;
        Lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

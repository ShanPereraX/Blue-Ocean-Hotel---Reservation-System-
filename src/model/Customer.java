package model;

public class Customer {
    private String nic;
    private String name;
    private String contactNo;
    private String email;

    public Customer() {
    }

    public Customer(String nic, String name, String contactNo, String email) {
        this.nic = nic;
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
    }

    public String getNic() {
        return this.nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return this.contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

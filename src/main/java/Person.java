public class Person {

    private String name;
    private String address;
    private String mobilenumber;
    private String worknumber;
    private String birthday;    // Change to Date?

    public Person (String name) {
        this.name = name;
    }

    public Person (String name, String adress, String mobilenumber, String worknumber, String birthday) {
        this.name = name;
        this.address = adress;
        this.mobilenumber = mobilenumber;
        this.worknumber = worknumber;
        this.address = adress;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(String worknumber) {
        this.worknumber = worknumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

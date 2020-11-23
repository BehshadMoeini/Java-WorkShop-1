public class Owner {
    private String name ,phoneNumber,nationalCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
    
    @Override
    public String toString() {
        return String.format("mr/mrs %s ,National Code: %s ,Phone Number: %s",
                getName(), getNationalCode(), getPhoneNumber());
    }
}

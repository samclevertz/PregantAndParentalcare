
class Child {
    String firstName;
    String lastName;
    String dob;
    String address;

    public Child(String firstName, String lastName, String dob, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Child Details");
        System.out.println("First name :" + getFirstName());
        System.out.println("Last name :" + getLastName());
        System.out.println("Date of birth :" + getDob());
        System.out.println("Address :" + getAddress());
        System.out.println();
    }

    public void viewTestResult(String diseaseType, String diseaseStartDate, String medicineName) {
        System.out.println("Test Result:");
        System.out.println("Disease Type: " + diseaseType);
        System.out.println("Disease Start Date: " + diseaseStartDate);
        System.out.println("Medicine Name: " + medicineName);
        System.out.println();
    }
}

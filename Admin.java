import java.util.Scanner;

class Admin {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String dob;
    private String address;
    private String email;

    public Admin(String firstName, String lastName, int phoneNumber, String dob, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.address = address;
        this.email = email;
    }

    public Admin(String firstName, String lastName, String dob, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;

    }

    public void addPregnant() {
        System.out.println("Pregnant Information");
        System.out.println("First name :" + firstName);
        System.out.println("Last name :" + lastName);
        System.out.println("Date of birth :" + phoneNumber);
        System.out.println("Address :" + dob);
        System.out.println("Date of birth :" + address);
        System.out.println("Address :" + email);
        System.out.println();
    }

    public void addDoctor() {
        System.out.println("Doctor Information");
        System.out.println("First name :" + firstName);
        System.out.println("Last name :" + lastName);
        System.out.println("Date of birth :" + phoneNumber);
        System.out.println("Address :" + dob);
        System.out.println("Date of birth :" + address);
        System.out.println("Address :" + email);
        System.out.println();
    }

    public void addChild() {
        System.out.println("Child Information");
        System.out.println("First name :" + firstName);
        System.out.println("Last name :" + lastName);
        System.out.println("Address :" + dob);
        System.out.println("Date of birth :" + address);
        System.out.println();
    }

    
}
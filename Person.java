
class Person {
  private String firstName;
  private String lastName;
  private int phoneNumber;
  private String dob;
  private String address;
  private String email;

  public Person(String firstName, String lastName, int phoneNumber, String dob, String address, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.dob = dob;
    this.address = address;
    this.email = email;
  }

  public void displayDetails() {
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Date of Birth: " + dob);
    System.out.println("Address: " + address);
    System.out.println("Email: " + email);
    System.out.println( );
  }
}







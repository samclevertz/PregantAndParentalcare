// Pregnant class
class Pregnant extends Person {
  public Pregnant(String firstName, String lastName, int phoneNumber, String dob, String address, String email) {
    super(firstName, lastName, phoneNumber, dob, address, email);
  }

  public void displayDetails() {
    super.displayDetails();
  }

  public void viewTestResult(String diseaseType, String diseaseStartDate, String medicineName) {
    System.out.println("Test Result:");
    System.out.println("Disease Type: " + diseaseType);
    System.out.println("Disease Start Date: " + diseaseStartDate);
    System.out.println("Medicine Name: " + medicineName);
    System.out.println( );
  }
}

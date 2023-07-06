// Main class for testing
public class PregnantTestProgram {
  public static void main(String[] args) {
    Pregnant pregnant1 = new Pregnant("Fatma", "omar", 77957924, "12/1/2001", "123 Main St", "alice@example.com");
    Pregnant pregnant2 = new Pregnant("Asha", "Ali", 778792546, "10/01/2000", "Amani", "Asha ali@gmail.com");
    
    System.out.println("Pregnant Details:");
    pregnant1.displayDetails();
    pregnant1.viewTestResult("Uvimbe kweny kizazi", "2023-06-01", "Panadol");
   

    System.out.println("Pregnant Details:");
    pregnant2.displayDetails();
    pregnant2.viewTestResult("Malaria", "2023-03-05", "Cloroquen");

  }
}



public class DoctorTestProgram {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Masoud", "Mmanga", 779791909, "02/01/1994", "Mtendeni", "m.mmanga@gmail.com");

        doctor1.displayDetails();

        doctor1.uploadTestResult("Malaria", "2023-03-05", "Cloroquen");
    }
}

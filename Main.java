// Main class for testing
public class Main {
    public static void main(String[] args) {
        Admin preg1 = new Admin("Rehema", "Ali", 7997979, "10/25/2001", "K/samaki", "rehema@gmail.com");
        Admin doctor1 = new Admin("sam", "mauid", 7997979, "10/25/2001", "Amani", "salumalbattawy@gmail.com");

        Admin child1 = new Admin("Makame", "Omar", "10/25/2010", "Mwera");

        //preg1.addPregnant();
        //doctor1.addDoctor();
        child1.addChild();

    }

}

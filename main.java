public class main {
    public static void main(String[] args) {
        // Create objects of the driverLicense class using overloaded constructors
        driverLicense license1 = new driverLicense();
        driverLicense license2 = new driverLicense("John Doe", "123 Main St", 180, 75, "Brown", "Blue");
        driverLicense license3 = new driverLicense("Jane Smith", "456 Elm St", 165, 60, "Blonde", "Green");

        // Call accessor and mutator methods for testing purposes
        license1.setName("Alice");
        System.out.println(license1.getName());
        System.out.println(license2.getWeight());
        license3.setHairColor("Black");
        System.out.println(license3.getHairColor());

        // Create a copy of one of the objects using the copy constructor
        driverLicense licenseCopy = new driverLicense(license2);
    }
}

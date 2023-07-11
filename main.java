public class main {
    static class driverLicense {
        private String name;
        private String address;
        private int height;
        private int weight;
        private String hairColor;
        private String eyeColor;
        private String driverLicenseNumber;
        private static int licenseCount = 1000;

        private static int instanceCount = 0;

        //accessor methods
        public String getName() {
            return name;
        }
        public String getAddress() {
            return address;
        }
        public int getHeight() {
            return height;
        }
        public int getWeight() {
            return weight;
        }
        public String getHairColor() {
            return hairColor;
        }
        public String getEyeColor() {
            return eyeColor;
        }
        public String getDriverLicenseNumber() {
            return driverLicenseNumber;
        }
        public static int getLicenseCount() {
            return licenseCount;
        }
        public static int getInstanceCount() {
            return instanceCount;
        }

        //mutator methods
        public void setName(String name) {
            this.name = name;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void setHeight(int height) {
            this.height = height;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }
        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }
        public void setDriverLicenseNumber(String driverLicenseNumber) {
            this.driverLicenseNumber = driverLicenseNumber;
        }
        public static void setLicenseCount(int licenseCount) {
            driverLicense.licenseCount = licenseCount;
        }
        public static void setInstanceCount(int instanceCount) {
            driverLicense.instanceCount = instanceCount;
        }



        //constructor
        public driverLicense(String name, String address, int height, int weight, String hairColor, String eyeColor){
            //instantiate variables
            this.name=name;
            this.address=address;
            this.height=height;
            this.weight=weight;
            this.hairColor=hairColor;
            this.eyeColor=eyeColor;
        }

        //constructor copy
        public driverLicense(driverLicense other) {
            this.name = other.name;
            this.address = other.address;
            this.height = other.height;
            this.weight = other.weight;
            this.hairColor = other.hairColor;
            this.eyeColor = other.eyeColor;
        }

        //overloaded constructor that counts instance
        public driverLicense(int token){
            token = instanceCount++;
        }

        //overloaded constructor that calls numberGenerator()
        public driverLicense() {
            numberGenerator();
        }

        //Number generator method
        int numberGenerator() {
            licenseCount++;
            driverLicenseNumber = "CA" + licenseCount;
            return licenseCount;
        }
    }

    // Helper method to print driverLicense details
    public static void printDriverLicenseDetails(driverLicense license) {
        System.out.println("Name: " + license.getName());
        System.out.println("Address: " + license.getAddress());
        System.out.println("Height: " + license.getHeight());
        System.out.println("Weight: " + license.getWeight());
        System.out.println("Hair Color: " + license.getHairColor());
        System.out.println("Eye Color: " + license.getEyeColor());
        System.out.println("Driver License Number: " + license.getDriverLicenseNumber());
    }
    public static void main(String[] args) {

        // Create driverLicense objects using different constructors
        driverLicense license1 = new driverLicense("John Doe", "123 Main St", 180, 75, "Brown", "Blue");
        driverLicense license2 = new driverLicense(1234);
        driverLicense license3 = new driverLicense();

        // Output the details of each driverLicense object
        System.out.println("Driver License 1:");
        printDriverLicenseDetails(license1);
        System.out.println();

        System.out.println("Driver License 2:");
        printDriverLicenseDetails(license2);
        System.out.println();

        System.out.println("Driver License 3:");
        printDriverLicenseDetails(license3);
    }
}

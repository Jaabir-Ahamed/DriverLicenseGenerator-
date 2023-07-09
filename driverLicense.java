public class driverLicense {
    private String name;
    private String address;
    private double height;
    private double weight;
    private String hairColor;
    private String eyeColor;
    private String licenseNumber;
    private static int licenseCount = 1000;

    // Copy constructor
    public driverLicense(driverLicense other) {
        this.name = other.name;
        this.address = other.address;
        this.height = other.height;
        this.weight = other.weight;
        this.hairColor = other.hairColor;
        this.eyeColor = other.eyeColor;
        this.licenseNumber = other.licenseNumber;
    }

    // Overloaded constructors
    public driverLicense() {
        countInstance();
        licenseNumber = numberGenerator();
    }

    public driverLicense(String name, String address, double height, double weight, String hairColor, String eyeColor) {
        this.name = name;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        countInstance();
        licenseNumber = numberGenerator();
    }

    private void countInstance() {
        licenseCount++;
    }

    private String numberGenerator() {
        String stateAbbreviation = "CA"; // Example state abbreviation
        return stateAbbreviation + licenseCount;
    }

    // Accessor and mutator methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
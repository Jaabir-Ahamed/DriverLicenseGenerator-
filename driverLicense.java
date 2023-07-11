class driverLicense {
    private String name;
    private String address;
    private int height;
    private int weight;
    private String hairColor;
    private String eyeColor;
    private String driverLicenseNumber;
    private static int licenseCount = 1000;

    private static int instanceCount = 0;

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
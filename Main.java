public class Main {
    public static void main(String[] args) {
        // Create a package instance
        Package pkg1 = new Package(7.5, 30, 20, 15, "New York", Package.calculateShippingCost(7.5));
        
        // Display package details
        pkg1.displayPackageDetails();

        // Create another package instance
        Package pkg2 = new Package(3.0, 25, 15, 10, "Los Angeles", Package.calculateShippingCost(3.0));

        // Display second package details
        pkg2.displayPackageDetails();
    }
}

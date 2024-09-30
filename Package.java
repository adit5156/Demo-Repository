public class Package {
    private double weight; // in kilograms
    private double length; // in centimeters
    private double width;  // in centimeters
    private double height; // in centimeters
    private String destination;
    private double cost;   // in currency

    // Constructor to initialize package information
    public Package(double weight, double length, double width, double height, String destination, double cost) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.destination = destination;
        this.cost = cost;
    }

    // Getters
    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getDestination() {
        return destination;
    }

    public double getCost() {
        return cost;
    }

    // Method to display package details
    public void displayPackageDetails() {
        System.out.println("Package Details:");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Dimensions: " + length + " cm x " + width + " cm x " + height + " cm");
        System.out.println("Destination: " + destination);
        System.out.println("Cost: $" + cost);
    }

    // Method to calculate shipping cost based on weight
    public static double calculateShippingCost(double weight) {
        double baseCost = 5.0; // Base cost
        double additionalCost = weight > 5 ? (weight - 5) * 1.5 : 0; // $1.5 for each kg over 5 kg
        return baseCost + additionalCost;
    }
}

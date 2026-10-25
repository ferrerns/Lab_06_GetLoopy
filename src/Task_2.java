void main() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    double gallons = 0, mpg = 0, pricePerGallon = 0;

    System.out.println("=== Fuel Costs Calculator ===");

    do {
        System.out.print("Enter gallons of gas in the tank: ");
        if (scanner.hasNextDouble()) {
            gallons = scanner.nextDouble();
            if (gallons >= 0) break;
        } else {
            scanner.next();
        }
        System.out.println("Invalid input. Please enter a positive number.");
    } while (true);

    do {
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        if (scanner.hasNextDouble()) {
            mpg = scanner.nextDouble();
            if (mpg > 0) break;
        } else {
            scanner.next();
        }
        System.out.println("Invalid input. MPG must be greater than 0.");
    } while (true);

    do {
        System.out.print("Enter price of gas per gallon ($): ");
        if (scanner.hasNextDouble()) {
            pricePerGallon = scanner.nextDouble();
            if (pricePerGallon >= 0) break;
        } else {
            scanner.next();
        }
        System.out.println("Invalid input. Please enter a valid price.");
    } while (true);

    double costPer100Miles = (100.0 / mpg) * pricePerGallon;
    double totalRange = gallons * mpg;

    System.out.println("\n--- Results ---");
    System.out.printf("Cost to drive 100 miles: $%.2f%n", costPer100Miles);
    System.out.printf("Distance car can go with full tank: %.2f miles%n", totalRange);

    scanner.close();
}
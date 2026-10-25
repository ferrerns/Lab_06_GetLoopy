void main() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    double width = 0, height = 0;

    System.out.println("=== Rectangle Information Calculator ===");

    do {
        System.out.print("Enter the width of the rectangle: ");
        if (scanner.hasNextDouble()) {
            width = scanner.nextDouble();
            if (width > 0) break;
        } else {
            scanner.next();
        }
        System.out.println("Invalid input. Width must be a positive number.");
    } while (true);

    do {
        System.out.print("Enter the height of the rectangle: ");
        if (scanner.hasNextDouble()) {
            height = scanner.nextDouble();
            if (height > 0) break;
        } else {
            scanner.next();
        }
        System.out.println("Invalid input. Height must be a positive number.");
    } while (true);

    double area = width * height;
    double perimeter = 2 * (width + height);
    double diagonal = Math.hypot(width, height);

    System.out.println("\n--- Results ---");
    System.out.printf("Area: %.2f%n", area);
    System.out.printf("Perimeter: %.2f%n", perimeter);
    System.out.printf("Diagonal length: %.2f%n", diagonal);

    scanner.close();
}

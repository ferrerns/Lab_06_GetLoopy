void main() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    double celsius = 0.0;
    boolean isValid = false;

    System.out.println("=== Celsius to Fahrenheit Converter ===");

    do {
        System.out.print("Enter temperature in Celsius: ");
        if (scanner.hasNextDouble()) {
            celsius = scanner.nextDouble();
            isValid = true;
        } else {
            System.out.println("Invalid input! Please enter a valid numerical temperature.");
            scanner.next();
        }
    } while (!isValid);

    double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

    System.out.printf("Equivalent temperature in Fahrenheit: %.2f°F%n", fahrenheit);
    scanner.close();
}

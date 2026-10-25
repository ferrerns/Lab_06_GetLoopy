void main() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    java.util.Random random = new java.util.Random();

    int targetNumber = random.nextInt(10) + 1;
    int userGuess = 0;

    System.out.println("=== High or Low Guessing Game ===");

    do {
        System.out.print("Guess a number between 1 and 10: ");
        if (scanner.hasNextInt()) {
            userGuess = scanner.nextInt();
            if (userGuess >= 1 && userGuess <= 10) {
                break;
            }
        } else {
            scanner.next();
        }
        System.out.println("Invalid input! Please enter an integer from 1 to 10.");
    } while (true);

    System.out.println("The computer's secret number was: " + targetNumber);

    if (userGuess > targetNumber) {
        System.out.println("Your guess was too HIGH!");
    } else if (userGuess < targetNumber) {
        System.out.println("Your guess was too LOW!");
    } else {
        System.out.println("Spot on! Your guess was ON THE MONEY!");
    }

    scanner.close();
}

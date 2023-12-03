import java.util.Scanner;

public class StudyChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int progress = 0;
        int points = 0;
        final int CHALLENGE_POINTS = 10;
        final int REWARD_THRESHOLD = 50;

        System.out.println("Welcome to Study Challenges!");

        while (true) {
            System.out.println("Choose a challenge to complete:");
            System.out.println("1. Read a chapter");
            System.out.println("2. Solve practice problems");
            System.out.println("3. Write a summary");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Great job! You completed the 'Read a chapter' challenge.");
                    progress += 10;
                    points += CHALLENGE_POINTS;
                    break;
                case 2:
                    System.out.println("Awesome! You completed the 'Solve practice problems' challenge.");
                    progress += 15;
                    points += CHALLENGE_POINTS;
                    break;
                case 3:
                    System.out.println("Well done! You completed the 'Write a summary' challenge.");
                    progress += 20;
                    points += CHALLENGE_POINTS;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid challenge.");
                    break;
            }

            if (progress >= REWARD_THRESHOLD) {
                System.out.println("\nCongratulations! You've reached " + REWARD_THRESHOLD +
                        " points and unlocked a reward!");
                // Add your reward system logic here
                // For example, you can provide a specific reward or increase some user level.
                System.out.println("Enjoy your reward!");
                break;  // End the program after reaching the reward threshold
            }

            System.out.println("\nCurrent Progress: " + progress + " points");
            System.out.println("Total Points: " + points + " points");
            System.out.println("-------------------------------");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class StudyChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Scanner scanner2 = new Scanner(System.in);
        Scanner pointsScanner = new Scanner(System.in);

        int progress = 0;
        int points = 0;
        final int CHALLENGE_POINTS = 10;
        final int REWARD_THRESHOLD = 50;

        System.out.println("Welcome to Study Challenges!");

        while (true) {
            System.out.println("Choose your challenge!");
            System.out.println("Earn 50 points to unlock a reward!");
            System.out.println("1. Read a chapter");
            System.out.println("2. Solve practice problems");
            System.out.println("3. Write a summary");
            System.out.println("4. Create your own challenge!");

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
               case 4:
                    System.out.println("What challenge do you want to tackle? ");
                    String assignChallenge = scanner2.nextLine();
                    System.out.println("How many points do you want to assign for this task? Max Points is 30");
                    int assignPoints = pointsScanner.nextInt();
                    
                    while (assignPoints>30) {
                        System.out.println("Invalid. Try again. ");
                        assignPoints = pointsScanner.nextInt();
                    }
                    
                    System.out.println("Well done! You completed the " + assignChallenge + " challenge and earned " + assignPoints + " points!");
                    progress += assignPoints;
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

            System.out.println("\nPoints Earned: " + progress + " points");
            System.out.println("Tasks completed: " + points/10);
            System.out.println("-------------------------------");
        }

        scanner.close();
    }
}

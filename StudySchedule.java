import java.util.Scanner;

public class StudySchedule {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week you would want edit the study scheduler (e.g., Monday = 1): ");
        int dayOfWeek = sc.nextInt();

        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";

                break;
            case 3:
                dayName = "Wednesday";

                break;
            case 4:
                dayName = "Thursday";

                break;
            case 5:
                dayName = "Friday";

                break;
            case 6:
                dayName = "Saturday";

                break;
            case 7:
                dayName = "Sunday";

                break;
            default:
                dayName = "Invalid day";
                break;
        }
        itinerary(dayName);

}

    public static void itinerary(String dayName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do " + dayName + " (type exit if you finished)");
        StringBuilder userText = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            userText.append(line).append("\n");
        }
        System.out.println(dayName + "'s Itinerary:\n" + userText.toString());
        scanner.close();

    }

}

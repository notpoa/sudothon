import java.util.Scanner;

public class AttendanceTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Attendance Tracker!");

        while (true) {
            System.out.println("Enter student name (or 'exit' to end): ");
            String studentName = scanner.nextLine();

            if (studentName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the day of the week for " + studentName + " (e.g., Monday): ");
            String dayOfWeek = scanner.nextLine();

            System.out.println("Enter clock in time for " + studentName + " (HH:mm): ");
            String clockInTime = scanner.nextLine();
            System.out.println("AM or PM?");
            String clockInDenote= scanner.nextLine();

            System.out.println("Enter clock out time for " + studentName + " (HH:mm): ");
            String clockOutTime = scanner.nextLine();
            System.out.println("AM or PM?");
            String clockOutDenote= scanner.nextLine();

            System.out.println("\nAttendance Report for " + studentName + " on " + dayOfWeek + ":");
            System.out.println("Clock In Time: " + clockInTime + clockInDenote);
            System.out.println("Clock Out Time: " + clockOutTime + clockOutDenote);
            System.out.println("------------------------");
        }

        scanner.close();
    }
}

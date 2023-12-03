import java.util.Scanner;

public class PomodomoTimer {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        //ask user how many hours they want to study for the day.
        System.out.println("How Many hours would you like to study today?");
        double studyTime = userinput.nextDouble();

        //convert the study time to int minutes

        int studyTimeInMinutes = (int) (studyTime * 60);

        // find out how many 30 minutes session will be in the total time given.
        int numSessions = studyTimeInMinutes / 30;

        //convert the session times to seconds
        int numStudySessions = studyTimeInMinutes / 30;

        // Calculate the number of 5-minute breaks
        int numBreaks = numStudySessions; // One less break than study session

        // Output the results
        System.out.println("You will have " + numStudySessions + " study sessions and " +
                numBreaks + " breaks during your study time.");
        // run the study session and breaks(30-minute study sessions and 5-minute breaks)
        for (int session = 1; session < numStudySessions; session++) {
            System.out.println("Session " + session + ":Study for 30 minutes.");
            countDownTimer studyCounter = new countDownTimer(30 * 60);
            Thread studyThread = new Thread(studyCounter);
            studyThread.start();
            try {
                studyThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // runs the 5-minute break
            if (session < numStudySessions) {
                System.out.println("It is now time to rest for 5 minutes and refresh  your mind.");
                countDownTimer rest = new countDownTimer(5 * 60);
                Thread restThread = new Thread(rest);
                restThread.start();
                try {
                    restThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}


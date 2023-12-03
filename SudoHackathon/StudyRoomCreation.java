package SudoHackathon;

import java.util.Scanner;

public class StudyRoomCreation {
    private String studyRoomName;
    private String topics;
    private String color;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name your study room: ");
        String studyRoomName = scanner.nextLine();
        StudyRoomCreation studyRoom = new StudyRoomCreation(studyRoomName);

        System.out.println("Enter your topics: ");
        String topics = scanner.nextLine();
        studyRoom.addTopics(topics);

        System.out.println("Enter your study room color: ");
        String color = scanner.nextLine();
        studyRoom.addColor(color);

        scanner.close();

        System.out.println("Study Room Details:");
        System.out.println(studyRoom);
    }

    public StudyRoomCreation(String name) {
        this.studyRoomName = name;
    }

    public void addTopics(String topics) {
        this.topics = topics;
    }

    public String getTopics() {
        return topics;
    }

    public void addColor(String color) {
        this.color = color;
    }

    public String getColors() {
        return color;
    }

    @Override
    public String toString() {
        return "Study Room Name: " + studyRoomName + "\n" +
               "Topics: " + topics + "\n" +
               "Color: " + color;
    }
}

package SudoHackathon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserProfiles {
	    private String username;
	    private List<String> interests;
	    private List<String> studyPreferences;
	    private List<String> areasOfExpertise;
	    
	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	    	 
	    	 System.out.print("Enter your username: ");
	    	 String username1 = scanner.nextLine();
	    	 UserProfiles user = new UserProfiles(username1);
	    	 
	    	 System.out.println("Enter your interests: ");
	         String interestInput = scanner.nextLine();
	         List<String> interest1 = Arrays.asList(interestInput.split(",\\s*"));
	         user.updateInterests(interest1);

	         System.out.println("Enter your study preferences: ");
	         String studyPreferencesInput = scanner.nextLine();
	         List<String> studyPreferences1 = Arrays.asList(studyPreferencesInput.split(",\\s*"));
	         user.updateStudyPreferences(studyPreferences1);

	         System.out.println("Enter your areas of expertise: ");
	         String expertiseInput = scanner.nextLine();
	         List<String> expertise1 = Arrays.asList(expertiseInput.split(",\\s*"));
	         user.updateAreasOfExpertise(expertise1);

	         user.displayProfile();

	         scanner.close();
	    	 
		}

	    public UserProfiles(String username) {
	        this.username = username;
	        this.interests = new ArrayList<>();
	        this.studyPreferences = new ArrayList<>();
	        this.areasOfExpertise = new ArrayList<>();
	    }
	   
	    public void updateInterests(List<String> interests) {
	        this.interests = interests;
	    }

	    public void updateStudyPreferences(List<String> studyPreferences) {
	        this.studyPreferences = studyPreferences;
	    }

	    public void updateAreasOfExpertise(List<String> areasOfExpertise) {
	        this.areasOfExpertise = areasOfExpertise;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public List<String> getInterests() {
	        return interests;
	    }

	    public List<String> getStudyPreferences() {
	        return studyPreferences;
	    }

	    public List<String> getAreasOfExpertise() {
	        return areasOfExpertise;
	    }

	    public void displayProfile() {
	        System.out.println("Username: " + username);
	        System.out.println("Interests: " + String.join(", ", interests));
	        System.out.println("Study Preferences: " + String.join(", ", studyPreferences));
	        System.out.println("Areas of Expertise: " + String.join(", ", areasOfExpertise));
	    }

}

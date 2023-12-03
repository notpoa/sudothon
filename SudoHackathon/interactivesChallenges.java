package SudoHackathon;

import java.util.Scanner;

public class interactivesChallenges {
	public static void main(String[] args) {
      
        Quiz myQuiz = new Quiz("Sudo Trivia");

        String[] options1 = {"Costco hot dog server", "D1 football coach", "Homeless", "Bartender"};
        TriviaQuestion question1 = new TriviaQuestion("What is Sudo's real totally not fake job?", options1, "Costco hot dog server");
        myQuiz.addQuestion(question1);

        String[] options2 = {"Quality Time", "Content Creation", "Vicious Head", "Porsche"};
        TriviaQuestion question2 = new TriviaQuestion("What is Sudo's love language?", options2, "Vicious Head");
        myQuiz.addQuestion(question2);

        String[] options3 = {"14", "26", "69", "21"};
        TriviaQuestion question3 = new TriviaQuestion("What is Sudo's age?", options3, "26");
        myQuiz.addQuestion(question3);
        
        Scanner quizScanner = new Scanner(System.in);
        
        System.out.println("Quiz: " + myQuiz.getTitle());
        for (TriviaQuestion question : myQuiz.getQuestions()) {
            System.out.println(question.getQuestion());
            for (String option : question.getOptions()) {
                System.out.println("- " + option);   
            }
            String answer = quizScanner.nextLine();
            if(question.checkAnswer(answer))
            	System.out.println("Correct answer! WOooooOOO you get an intership at refer me from "
            			+ "sudo!");
            else
            	System.out.println("Incorrect answer :(!");
        }
        
        quizScanner.close();
    }

}

package SudoHackathon;

public class TriviaQuestion {
	private String question;
	private String[] options;
	private String correctAnswer;

	public TriviaQuestion(String question, String[] options, String correctAnswer) {
		this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }  
}

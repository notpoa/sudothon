package SudoHackathon;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
	private String title;
    private List<TriviaQuestion> questions;

    public Quiz(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(TriviaQuestion question) {
        questions.add(question);
    }

    public String getTitle() {
        return title;
    }

    public List<TriviaQuestion> getQuestions() {
        return questions;
    }
}

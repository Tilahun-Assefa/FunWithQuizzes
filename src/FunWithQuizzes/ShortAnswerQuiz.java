package FunWithQuizzes;

import java.util.ArrayList;
import java.util.HashMap;

public class ShortAnswerQuiz extends Question{
    private ArrayList<String> choices;
    private HashMap<String, Double> correctAnswers;
    private ArrayList<String> userAnswers;

    public ShortAnswerQuiz(String statement, ArrayList<String> choices, HashMap<String, Double> answers){
        super(statement);
        this.choices = choices;
        this.correctAnswers = answers;
    }

    @Override
    public void displayQuiz() {

    }

    @Override
    public double markAnswer() {
        return 0;
    }

    @Override
    public void displayAnswer() {

    }
}

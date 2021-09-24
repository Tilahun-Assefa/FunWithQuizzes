package FunWithQuizzes;

import java.util.ArrayList;
import java.util.HashMap;

public class LinearScaleQuiz extends Question {
    private int minScale;
    private int maxScale;
    private int userAnswer;
    private int correctAnswer;
    private double answerPoint;

    public LinearScaleQuiz(String statement, int min, int max, int answer, double point) {
        super(statement);
        minScale = min;
        maxScale = max;
        userAnswer = answer;
        answerPoint = point;
    }

    @Override
    public void displayQuiz() {
        System.out.println(getQuizId() + ". " + getStatement());
    }

    @Override
    public double markAnswer() {
        return 0;
    }

    @Override
    public void displayAnswer() {

    }
}

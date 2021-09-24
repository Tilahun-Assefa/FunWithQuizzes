package FunWithQuizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TrueFalseQuiz extends Question {
    private boolean userAnswer;
    private boolean correctAnswer;
    private double answerPoint;

    public TrueFalseQuiz(String statement, boolean correctAnswer, double answerPoint) {
        super(statement);
        this.correctAnswer = correctAnswer;
        this.answerPoint = answerPoint;
    }

    @Override
    public void displayQuiz() {
        Scanner input = new Scanner(System.in);
        System.out.println(getQuizId() + ". " + getStatement() + "\n Answer by writing true or false");
        userAnswer = Boolean.valueOf(input.next().trim());
        if (userAnswer == correctAnswer) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    }

    @Override
    public double markAnswer() {
        return 0;
    }

    @Override
    public void displayAnswer() {
        System.out.println("The right answer is " +correctAnswer);
    }
}

package FunWithQuizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleChoiceQuiz extends Question{

    private ArrayList<String> choices;
    private Character  correctAnswer;
    private Character userAnswer;
    private double answerPoint;

    public MultipleChoiceQuiz(String statement, ArrayList<String> choices, Character correctAnswer, Double point){
        super(statement);
        this.choices = choices;
        this.correctAnswer = correctAnswer;
        this.answerPoint = point;
    }

    @Override
    public void displayQuiz() {
        Scanner input = new Scanner(System.in);
        System.out.println(getQuizId() + ". " + getStatement());
        for (String choice : choices) {
            System.out.println(choice);
        }
        userAnswer = input.next().trim().charAt(0);
        if(userAnswer == correctAnswer){
            System.out.println("Right");
        }else {
            System.out.println("Wrong");
        }
    }

    @Override
    public double markAnswer() {
        return 0;
    }

    @Override
    public void displayAnswer() {
            System.out.println(correctAnswer);
    }
}

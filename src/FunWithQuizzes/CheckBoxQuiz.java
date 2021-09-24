package FunWithQuizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckBoxQuiz extends Question {
    private ArrayList<String> choices;
    private HashMap<Character, Double> correctAnswers;
    private ArrayList<Character> userAnswers = new ArrayList<>();

    public CheckBoxQuiz(String statement, ArrayList<String> choices, HashMap<Character, Double> answers) {
        super(statement);
        this.choices = choices;
        this.correctAnswers = answers;
    }

    @Override
    public void displayQuiz() {
        Scanner input = new Scanner(System.in);
        System.out.println(getQuizId() + ". " + getStatement());
        for (String choice : choices) {
            System.out.println(choice);
        }

        String[] answers = input.next().trim().split(",");
        for(String str : answers){
            userAnswers.add(str.charAt(0));
        }

        //check the user answer correctness
        for(Character ans : userAnswers){
            if(correctAnswers.containsKey(ans)){
                System.out.println(ans + " is correct");
            }else{
                System.out.println("Wrong");
            }
        }
    }

    @Override
    public double markAnswer() {
        return 0;
    }

    @Override
    public void displayAnswer() {
        System.out.print("The right answers are ");
        for (Map.Entry<Character, Double> ans : correctAnswers.entrySet()) {
            System.out.print(ans.getKey()+",  ");
        }
        System.out.println();
    }
}

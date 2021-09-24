package FunWithQuizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Quiz {
    public ArrayList<Question> test = new ArrayList<>();

    public Quiz(){
        Question question;
        ArrayList<String> choices;
        HashMap<Character, Double> correctAnswerAndPoint;

        choices = new ArrayList<String>(List.of("A. choice a", "B. choice b", "C. choice c", "D. choice d"));
        question = new MultipleChoiceQuiz("MultipleChoice question statement", choices, 'a',4.0);
        test.add(question);

        choices = new ArrayList<String>(List.of("A. choice a", "B. choice b", "C. choice c", "D. choice d"));
        question = new MultipleChoiceQuiz("MultipleChoice question statement", choices, 'c',8.0);
        test.add(question);

        choices = new ArrayList<String>(List.of("A. choice a", "B. choice b", "C. choice c", "D. choice d"));
        question = new MultipleChoiceQuiz("MultipleChoice question statement", choices, 'd',5.0);
        test.add(question);

        choices = new ArrayList<String>(List.of("A. choice a", "B. choice b", "C. choice c", "D. choice d"));
        correctAnswerAndPoint = new HashMap<Character, Double>(){{put('c', 8.0); put('d', 4.0);}};
        question = new CheckBoxQuiz("Checkbox question statement", choices, correctAnswerAndPoint);
        test.add(question);

        choices = new ArrayList<String>(List.of("A. choice a", "B. choice b", "C. choice c", "D. choice d"));
        correctAnswerAndPoint = new HashMap<Character, Double>(){{put('a', 2.0); put('d', 3.0);}};
        question = new CheckBoxQuiz("Checkbox question statement", choices, correctAnswerAndPoint);
        test.add(question);

        question = new TrueFalseQuiz("Checkbox question statement", true, 5.0);
        test.add(question);

        question = new TrueFalseQuiz("Checkbox question statement", false, 4.0);
        test.add(question);
    }

    public void runQuiz(){
        for (Question q : test){
            q.displayQuiz();
            q.displayAnswer();
        }
    }
}

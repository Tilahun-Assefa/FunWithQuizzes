package FunWithQuizzes;

import java.util.ArrayList;
import java.util.HashMap;

public class ParagraphQuiz extends ShortAnswerQuiz{
    public ParagraphQuiz(String statement, ArrayList<String> choices, HashMap<String, Double> answers) {
        super(statement, choices, answers);
    }
}

package FunWithQuizzes;

public abstract class Question {
    private int quizId;
    private String statement ;
    private static int id =1;

    public int getQuizId() {
        return quizId;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Question(String statement){
        this.statement = statement;
        quizId = id;
        id++;
    }

    public abstract void displayQuiz();
    public abstract double markAnswer();
    public abstract void displayAnswer();
}

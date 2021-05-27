package data;

public class SAQuestion {
    private String question;
    private String answer;

    public SAQuestion(String qString, String aString) {
        this.question = qString;
        this.answer = aString;
    }

    public String getQuestion() {
        return this.question;
    }

    public boolean checkAnswer(String aString) {
        return this.answer.equals(aString);
    }
}

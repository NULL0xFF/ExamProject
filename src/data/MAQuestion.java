package data;

import java.util.ArrayList;

public class MAQuestion extends SAQuestion {
    private ArrayList<String> choice;

    public MAQuestion(String qString, ArrayList<String> cList, String aString) {
        super(qString, aString);
        this.choice = cList;
    }

    public ArrayList<String> getChoiceList() {
        return this.choice;
    }
}

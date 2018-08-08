import java.util.*;


public class FlashCardBuilder {
    public String term;
    public String definition;
    public int interval;


    public FlashCardBuilder() {
        term = "";
        definition = "";
    }

    //
    public FlashCardBuilder(String term, String definition) {
        this.term = term;
        this.definition = definition;
    }

    //returns the term
    public String getTerm() {
        return term;
    }

    //returns the definition
    public String getDefintion() {
        return definition;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return term + "\t" + definition;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}

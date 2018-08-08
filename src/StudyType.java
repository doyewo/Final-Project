import java.util.LinkedList;
import java.util.Collections;

public class StudyType {
    private FlashCardBuilder input1;
    private LinkedList<FlashCardBuilder> cardDeck;
    private int time;

    private static final int EASY = 20;
    private static final int MODERATE = 10;
    private static final int DIFFICULT= 5;
    public StudyType() {
        input1 = new FlashCardBuilder();

        time = 0;
    }

    public void setEasy() {
        FlashCardBuilder card = cardDeck.removeFirst();
        card.setInterval(EASY);
        cardDeck.add(EASY, card);
    }

    public void setModerate() {
        FlashCardBuilder card = cardDeck.removeFirst();
        card.setInterval(MODERATE);
        cardDeck.add(MODERATE, card);
    }

    public void setDifficult() {
        FlashCardBuilder card = cardDeck.removeFirst();
        card.setInterval(DIFFICULT);
        cardDeck.add(DIFFICULT, card);
    }



    public int getTime() {
        return time;
    }
    public void getRandomDeck(){
        Collections.shuffle(cardDeck);

    }

}

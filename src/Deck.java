import java.util.*;

public class Deck {

    Scanner kbDeck = new Scanner(System.in);
    int deckSize;
    String deckName;
    String quest;
    String ans;
    Queue<FlashCard> myDeck = new LinkedList<FlashCard>();


    public Deck(String name) {
        deckName = name;
        System.out.println("Enter an integer deck size:");
        deckSize = kbDeck.nextInt();
        kbDeck.nextLine();
        FlashCard[] fcArray = new FlashCard[deckSize];

        for (int i = 0; i < deckSize; i++) {
            System.out.println("\nCard " + (i + 1));
            System.out.println("enter question:");
            quest = kbDeck.nextLine();
            System.out.println("enter answer:");
            ans = kbDeck.nextLine();
            fcArray[i] = new FlashCard(quest, ans);
            myDeck.add(fcArray[i]);
        }
    }

    public void studyByQuestion() {

        FlashCard temp;
        for (int i = 0; i < deckSize; i++) {
            temp = myDeck.poll();
            System.out.println("Top:");
            System.out.println(temp.question);
            kbDeck.nextLine();
            System.out.println("Bottom:");
            System.out.println(temp.answer + "\n");
            myDeck.add(temp);

        }
    }



    public void showDeck() {
        FlashCard temp;

        for (int i = 0; i < deckSize; i++) {
            temp = myDeck.poll();
            System.out.println("Card " + (i+1));
            System.out.println(temp.question);
            System.out.println(temp.answer);
            myDeck.add(temp);

        }
    }

    public void shuffleDeck() {
        FlashCard[] shuffleDeck = new FlashCard[deckSize];
        FlashCard temp;

        for (int i = 0; i < deckSize; i++) {
            shuffleDeck[i] = myDeck.poll();
        }
        for (int i = deckSize - 1; i >= 1; i--) {
            int n = (int) Math.floor(Math.random() * (i));
            temp = shuffleDeck[i];
            shuffleDeck[i] = shuffleDeck[n];
            shuffleDeck[n] = temp;
        }
        for (int i = 0; i < deckSize; i++) {
            myDeck.add(shuffleDeck[i]);
        }
    }



    class FlashCard {
        String question;
        String answer;

        FlashCard(String q, String a) {
            question = q;
            answer = a;
        }
    }
}
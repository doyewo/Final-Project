import java.util.*;

public class Main {

    public static void main(String[] args) {

        int firstSwitch = 1;
        int secondSwitch;
        int userInput;
        String confirm;
        Scanner input = new Scanner(System.in);
        Deck newDeck;
        Deck chosenDeck;
        List<Deck> deckList = new ArrayList<Deck>();
        String temp;


        System.out.println("Hi!");
        System.out.println( "Create a deck.");


        do {
            switch (firstSwitch) {

                case 1:


                    System.out.println("Enter deck name:");
                    temp = input.nextLine();
                    newDeck = new Deck(temp);
                    deckList.add(newDeck);
                    break;

                case 2:


                    if (deckList.size() == 0) {
                        System.out.println("No deck is stored");
                        break;
                    }

                    else {
                        System.out.println("Enter an integer to select a deck:\n");
                        for (int i = 0; i < deckList.size(); i++) {
                            System.out.println((i + 1) + ". " + deckList.get(i).deckName);
                        }
                        userInput = input.nextInt();

                        if (userInput > deckList.size() || userInput <= 0) {
                            System.out.println("Selection not a valid deck.");
                            break;
                        }
                        chosenDeck = deckList.get(userInput-1);





                        do {

                            System.out.println("\n1. Show cards in " + chosenDeck.deckName);
                            System.out.println("2. Study " + chosenDeck.deckName );
                            System.out.println("3. Shuffle " + chosenDeck.deckName);
                            System.out.println("4. Delete " + chosenDeck.deckName);
                            System.out.println("5. Return to main menu\n");

                            secondSwitch = input.nextInt();
                            input.nextLine();

                            switch (secondSwitch) {
                                case 1:

                                    chosenDeck.showDeck();
                                    break;

                                case 2:

                                    chosenDeck.studyByQuestion();
                                    break;



                                case 3:

                                    chosenDeck.shuffleDeck();
                                    System.out.println("Your deck has been shuffled");
                                    break;

                                case 4:

                                    System.out.println("Are you sure you wish to delete " + chosenDeck.deckName + "? (Y/N)"); // The confirmation inquiry exists for the case that the user hits 4 on accident (user health)
                                    confirm = input.nextLine();
                                    if (confirm.equalsIgnoreCase("y")) {
                                        deckList.remove((userInput - 1));
                                        System.out.println("Deck deleted.");
                                    }
                                    else {
                                        System.out.println("Deck not deleted.");
                                    }
                                    break;

                                case 5:

                                    break;

                                default:
                                    System.out.println("Invalid choice");

                            }
                        } while (secondSwitch != 5);
                        System.out.println("Returning to main menu.");
                    }
                    break;




                case 3:

                    break;

                default:
                    System.out.println("invalid entry");
                    break;
            }


            System.out.println("Enter an number to choose a menu option");
            System.out.println("1. Create a deck.");
            System.out.println("2. Select a deck.");
            System.out.println("3. Exit Program.\n");

            firstSwitch = input.nextInt();
            input.nextLine();

        } while (firstSwitch != 3);
    }
}
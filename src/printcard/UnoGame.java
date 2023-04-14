/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printcard;
import java.util.*;

public class UnoGame {
    private List<String> deck = new ArrayList<>();
    private List<String> player1Hand = new ArrayList<>();
    private List<String> player2Hand = new ArrayList<>();
    private String firstCard;
    private boolean player1Turn;
    private boolean gameOver;
    int currentCard;

    public UnoGame() {
        initDeck();
        dealCards();
        startGame();
    }

    private void initDeck() {
        // Adding 0 to 9 cards of each color
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                deck.add(String.valueOf(j));
            }
            // Adding Skip, Reverse and Draw Two cards of each color
            for (int j = 0; j < 3; j++) {
                deck.add("Skip");
                deck.add("Reverse");
                deck.add("Draw Two");
            }
        }
        // Adding Wild and Wild Draw Four cards
        for (int i = 0; i < 4; i++) {
            deck.add("Wild");
            deck.add("Wild Draw Four");
        }
        shuffleDeck();
        firstCard = deck.get(0);
    }

    private void shuffleDeck() {
        Collections.shuffle(deck);
    }

    private void dealCards() {
        for (int i = 0; i < 7; i++) {
            player1Hand.add(deck.remove(i));
            player2Hand.add(deck.remove(i));
        }
    }
    private void drawCard(){
        if(player1Turn){
            player1Hand.add(deck.remove(0));
        }else{
            player2Hand.add(deck.remove(0));
        }
        if(player1Turn){
            player1Turn = false;
        }else{
            player1Turn = true;
        }
    }

    private void startGame() {
        player1Turn = true;
        String input;
        int chosenCard;
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            List<String> currentPlayerHand = player1Turn ? player1Hand : player2Hand;
            System.out.println("Current card: " + currentCard);
            System.out.println("Player 1 hand: " + player1Hand);
            System.out.println("Player 2 hand: " + player2Hand);
            System.out.println("It is " + (player1Turn ? "Player 1" : "Player 2") + "'s turn.");
            System.out.println("Enter the card you want to play or type 'draw' to draw a card:");
            input = scanner.nextLine();
            if(input.equals("draw")){
                drawCard();
            }else{
                chosenCard = Integer.parseInt(input);
                do{
                    if(chosenCard == currentCard){
                        currentCard = chosenCard;
                        currentPlayerHand.remove(input);
                    }else{
                        System.out.println("Invalid Card! Try again");
                        chosenCard = scanner.nextInt();
                    }
                }while(chosenCard != currentCard);
                if(player1Turn){
                    player1Turn = false;
                }else{
                    player1Turn = true;
                }
            } 
        }
    }
          
    public static void main(String[] args) {
        UnoGame game = new UnoGame();
    }
}

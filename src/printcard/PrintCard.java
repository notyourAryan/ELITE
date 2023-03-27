/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printcard;

/**
 * user interaction - view class
 * print cards
 * @author user
 */
public class PrintCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // print , delegated generation cards to the class
        GenerateCard ins = new GenerateCard();
        ins.generate(); // delegation cards are generated deck 
        for(Card c:ins.deck)
        {
            System.out.println(c.getS() + " "+c.getV());
        }
        
    }
    
}

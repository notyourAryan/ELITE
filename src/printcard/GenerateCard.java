/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printcard;

/**
 * responsible for generation of cards and stores in deck array
 * high cohesion
 * @author user
 */
public class GenerateCard
{
private int size = 60;
Card[] deck = new Card[size];
public void generate()
{
    int c = 0;
    for(Card.Suit s :Card.Suit.values()) //enum suits Hearts
    {
      
        for(  Card.Value v:Card.Value.values() ) //1
        {
            deck[c] = new Card(s,v); //deck[0] = hearts,1,2
            c++;
        }
    }
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printcard;

/** raw data  for the card suit,values
 * model the card - model class
 * @author user
 */
public class Card {
    /*enum - special class, user defined datatype - constants
    avengers - card game - 4 enum value safety and type safety , loose coupling */
    public enum Suit {RED,YELLOW,GREEN,BLUE};
    public enum Value {ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,SKIP ,REVERSE , DRAWTWO , DRAWFOUR , WILDCARD};    
    private Suit s;
    private Value v;
    public Card(Suit s,Value v)
    {
        this.s=s;
        this.v=v;
    }

    /**
     * @return the s
     */
    public Suit getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }
            
}

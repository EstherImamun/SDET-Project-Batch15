package class28.HomeWork;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    private int interestRate;
   private String cardType;

    public Card(int interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }
    public int getInterestRate(){
        return interestRate;
    }
    public String getCardType(){
        return cardType;
    }
    public void setInterestRate(int interestRate){
        this.interestRate=interestRate;
    }
    public void setCardType(String cardType){
        this.cardType=cardType;
    }
    public String print(){
        return cardType+" "+interestRate+" %";
    }

    public static void main(String[] args) {

        LinkedList<Card> cards = new LinkedList<>();
        Card card1 = new Card(5, "reward credit card");
        cards.add(card1);
        Card card2 = new Card(7, "Travel credit cards");
        cards.add(card2);
        Card card3 = new Card(3, "Business credit card");
        cards.add(card3);

        for (int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);
            System.out.println(c.print());

        }
        for(Card card:cards){
            System.out.println(card.print());
        }

        Iterator<Card> iterator=cards.iterator();
        while(iterator.hasNext()){
            Card c=iterator.next();
            System.out.println(c.print());
        }


    }
}

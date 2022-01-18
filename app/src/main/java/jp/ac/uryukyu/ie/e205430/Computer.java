package jp.ac.uryukyu.ie.e205430;

public class Computer {
    final int maxSize = 3;
    int hand;
    public int computerHand(){
        hand = (int)(Math.random() * maxSize);
        if(hand == 1){
            System.out.println("相手はグーを選びました。");
        }
        else if(hand == 2){
            System.out.println("相手はチョキを選びました。");
        }
        else{
            System.out.println("相手はパーを選びました。");
        }
        return hand;
    }
}

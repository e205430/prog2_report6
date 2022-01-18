package jp.ac.uryukyu.ie.e205430;

public class Computer implements Hand{
    final int maxSize = 3;
    int hand;
    private String name;

    public Computer(String name){
        this.name = "コンピュータ";
    }

    public String getName(){
        return name;
    }

    public int getHand(){
        return hand;
    }

    public void selectHand(){
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
        //return hand;
    }
}

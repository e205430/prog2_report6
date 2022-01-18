package jp.ac.uryukyu.ie.e205430;

public class Computer implements Hand{
    final int maxSize = 3;
    int hand;
    private String name;

    public Computer(String name){
        this.name = "コンピュータ";
    }

    /**
     * 相手の名前を取得
     * @return　相手の名前
     */
    public String getName(){
        return name;
    }

    /**
     * 相手のじゃんけんの手を取得(1:グー、2:チョキ、3:パー)
     * @return　相手のじゃんけんの手
     */
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

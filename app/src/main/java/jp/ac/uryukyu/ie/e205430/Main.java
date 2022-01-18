package jp.ac.uryukyu.ie.e205430;

public class Main {
    public static void main(String[] args) {
        
        Hand h = new Hand();
        Player p = new Player();
        Computer c = new Computer();
        h.showHandList();
        p.selectHand();
        c.computerHand();

        if(p.input == c.hand){
            System.out.println("あいこです。");
        }
        else if(p.input == 1 && c.hand == 2){
            System.out.println("あなたの勝ちです。");
        }
        else if(p.input == 2 && c.hand == 3){
            System.out.println("あなたの勝ちです。");
        }
        else if(p.input == 3 && c.hand == 1){
            System.out.println("あなたの勝ちです。");
        }
        else{
            System.out.println("あなたの負けです。");
        }
    }
}

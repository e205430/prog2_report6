package jp.ac.uryukyu.ie.e205430;

public class Main {
    public static void main(String[] args) {
        
        Player player = new Player();
        Computer computer = new Computer("コンピュータ");
        Judge judge = new Judge();
        player.showHandList();
    
        for (int i = 1; i <= 3; i++){
            System.out.println(i+"回戦目");
            System.out.println(player.getName()+ "が出すじゃんけんの手を選んでください。");
            player.selectHand();
            computer.selectHand();

            judge.playGame(player.getHand(), computer.getHand());
        }
        judge.finalResult();
    }
}

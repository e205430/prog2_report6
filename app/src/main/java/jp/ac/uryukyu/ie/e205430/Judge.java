package jp.ac.uryukyu.ie.e205430;

public class Judge {
    int playerWin = 0;
    int playerLose = 0;
    int even = 0;
    int judge;
    Player player = new Player();
    Computer computer = new Computer("コンピュータ");

    /**
     * 相手と自分のじゃんけんの手を指定する。
     * @param computerHand 相手のじゃんけんの手
     * @param  humanHand 自分のじゃんけんの手
     */
    public void playGame(int humanHand,int computerHand){
        
        if(humanHand == computerHand){
            System.out.println("あいこです。");
            even +=1;
            judge = 0;
        }
        else if((humanHand == 1 && computerHand == 2) || (humanHand == 2 && computerHand == 3) ||(humanHand == 3 && computerHand == 1)){
            System.out.println(player.getName()+"の勝ちです。");
            playerWin += 1;
            judge = 1;
        }
        else{
            System.out.println(player.getName()+"あなたの負けです。");
            playerLose += 1;
            judge = 2;
        }
    }

    public void finalResult(){
        System.out.println("最終結果:" + playerWin + "勝" + playerLose+"敗" + even+"引き分け");
        if(playerWin>playerLose){
            System.out.println("今回の勝負は"+player.getName()+"の勝ちです。");
        }
        else if(playerWin<playerLose){
            System.out.println("今回の勝負は"+player.getName()+"の負けです。");
        }
        else{
            System.out.println("今回の勝負は引き分けです");
        }
    }
    
}

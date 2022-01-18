package jp.ac.uryukyu.ie.e205430;

public class Judge {
    int playerWin = 1;
    int playerLose = 1;
    int even;
    int judge;
    Player player = new Player();
    Computer computer = new Computer("コンピュータ");

    public void playGame(int computerHand,int HumanHand){
        
        judge = (computerHand - HumanHand + 3 ) % 3;

        if(judge == 0){
            System.out.println("あいこです。");
            even +=1;
        }
        else if(judge == 1){
            System.out.println(player.getName()+"の勝ちです。");
            playerWin += 1;
        }
        else if(judge == 2){
            System.out.println(player.getName()+"あなたの負けです。");
            playerLose += 1;
            
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

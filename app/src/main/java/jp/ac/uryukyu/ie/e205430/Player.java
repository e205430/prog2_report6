package jp.ac.uryukyu.ie.e205430;
import java.util.Scanner;

public class Player implements Hand{
    int input;
    private String name;

    public Player(){
        this.name = "あなた";
    }

    public String getName(){
        return name;
    }

    public int getHand(){
        return input;
    }

    public void showHandList(){
        System.out.println("グー:" + gu);
        System.out.println("チョキ:" + choki);
        System.out.println("パー:" + pa);
    }

    public void selectHand(){

        Scanner scanner = new java.util.Scanner(System.in);
        int input=scanner.nextInt();
        if(input == 1){
            System.out.println("あなたはグーを選びました。");
        }
        else if(input == 2){
            System.out.println("あなたはチョキを選びました。");
        }
        else if(input == 3){
            System.out.println("あなたはパーを選びました。");
        }
        else{
            System.out.println("エラー");
        }
        //scanner.close();
        //return input;
    }
}


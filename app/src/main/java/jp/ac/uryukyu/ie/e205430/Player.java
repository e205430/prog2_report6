package jp.ac.uryukyu.ie.e205430;
import java.util.Scanner;

public class Player {
    int input;
    public int selectHand(){

        Scanner scanner = new java.util.Scanner(System.in);
        int input=scanner.nextInt();
        if(input == 1){
            System.out.println("あなたはグーを選びました。");
        }
        else if(input == 2){
            System.out.println("あなたはチョキを選びました。");
        }
        else{
            System.out.println("あなたはパーを選びました。");
        }
        scanner.close();
        return input;
    }
}


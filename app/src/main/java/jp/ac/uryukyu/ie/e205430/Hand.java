package jp.ac.uryukyu.ie.e205430;

public class Hand {
    final int gu = 1;
    final int choki = 2;
    final int pa = 3;

    public void showHandList(){
        System.out.println("あなたが出すじゃんけんの手を選んでください。");
        System.out.println("グー:" + gu);
        System.out.println("チョキ:" + choki);
        System.out.println("パー:" + pa);
    }
}

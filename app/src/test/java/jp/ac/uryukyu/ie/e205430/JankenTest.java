package jp.ac.uryukyu.ie.e205430;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class JankenTest {
    @Test
    void judgeTest(){
        int defaultJudge= 0;
        int cHand = 1;
        int hHand = 1;
        Judge judge = new Judge();

        judge.playGame(cHand, hHand);
        assertEquals(defaultJudge, judge.judge);


    }
}

package baekjoon.problem.p6581;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * HTML
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/6581">https://www.acmicpc.net/problem/6581</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "Hallo, dies ist eine \n" +
                "ziemlich lange Zeile, die in Html\n" +
                "aber nicht umgebrochen wird.\n" +
                "<br>\n" +
                "Zwei <br> <br> produzieren zwei Newlines. \n" +
                "Es gibt auch noch das tag <hr> was einen Trenner darstellt.\n" +
                "Zwei <hr> <hr> produzieren zwei Horizontal Rulers.\n" +
                "Achtung       mehrere Leerzeichen irritieren\n" +
                "\n" +
                "Html genauso wenig wie\n" +
                "\n" +
                "\n" +
                "mehrere Leerzeilen.";
        String output = "Hallo, dies ist eine ziemlich lange Zeile, die in Html aber nicht umgebrochen\n" +
                "wird.\n" +
                "Zwei\n" +
                "\n" +
                "produzieren zwei Newlines. Es gibt auch noch das tag\n" +
                "--------------------------------------------------------------------------------\n" +
                "was einen Trenner darstellt. Zwei\n" +
                "--------------------------------------------------------------------------------\n" +
                "--------------------------------------------------------------------------------\n" +
                "produzieren zwei Horizontal Rulers. Achtung mehrere Leerzeichen irritieren Html\n" +
                "genauso wenig wie mehrere Leerzeilen.";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
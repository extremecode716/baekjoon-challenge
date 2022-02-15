package baekjoon.problem.p10250;

import baekjoon.ExtremeCodeTest;
import org.junit.jupiter.api.Test;

/**
 * ACM 호텔
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10250">https://www.acmicpc.net/problem/10250</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2\n" +
                "6 12 10\n" +
                "30 50 72";
        String output = "402\n" +
                "1203";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase2() {
        String input = "17\n" +
                "1 1 1\n" +
                "99 99 9800\n" +
                "10 10 99\n" +
                "2 2 4\n" +
                "3 70 144\n" +
                "6 12 12\n" +
                "6 12 10\n" +
                "6 12 72\n" +
                "30 50 72\n" +
                "2 10 2\n" +
                "2 10 4\n" +
                "2 10 20\n" +
                "1 99 21\n" +
                "2 1 2\n" +
                "1 11 11\n" +
                "10 10 1\n" +
                "2 82 18";
        String output = "101\n" +
                "9899\n" +
                "910\n" +
                "202\n" +
                "348\n" +
                "602\n" +
                "402\n" +
                "612\n" +
                "1203\n" +
                "201\n" +
                "202\n" +
                "210\n" +
                "121\n" +
                "201\n" +
                "111\n" +
                "101\n" +
                "209";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }
}
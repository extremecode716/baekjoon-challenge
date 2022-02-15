package baekjoon.problem.p11653;

import baekjoon.ExtremeCodeTest;
import org.junit.jupiter.api.Test;

/**
 * 소인수분해
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11653">https://www.acmicpc.net/problem/11653</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "72";
        String output = "2\n" +
                "2\n" +
                "2\n" +
                "3\n" +
                "3";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase2() {
        String input = "3";
        String output = "3";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase3() {
        String input = "6";
        String output = "2\n" +
                "3";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase4() {
        String input = "2";
        String output = "2";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase5() {
        String input = "9991";
        String output = "97\n" +
                "103";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }
}
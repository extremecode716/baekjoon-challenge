package baekjoon.problem.p3009;

import baekjoon.ExtremeCodeTest;
import org.junit.jupiter.api.Test;

/**
 * 네 번째 점 Test
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/3009">https://www.acmicpc.net/problem/3009</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5 5\n" +
                "5 7\n" +
                "7 5";
        String output = "7 7";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase2() {
        String input = "30 20\n" +
                "10 10\n" +
                "10 20";
        String output = "30 10";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }
}
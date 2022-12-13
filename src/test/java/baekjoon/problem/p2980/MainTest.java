package baekjoon.problem.p2980;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 도로와 신호등
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2980">https://www.acmicpc.net/problem/2980</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2 10\n" +
                "3 5 5\n" +
                "5 2 2";
        String output = "12";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "4 30\n" +
                "7 13 5\n" +
                "14 4 4\n" +
                "15 3 10\n" +
                "25 1 1";
        String output = "36";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
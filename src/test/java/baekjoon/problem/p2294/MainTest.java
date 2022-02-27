package baekjoon.problem.p2294;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 동전 2
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2294">https://www.acmicpc.net/problem/2294</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "3 15\n" +
                "1\n" +
                "5\n" +
                "12";
        String output = "3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "2 14\n" +
                "1\n" +
                "5";
        String output = "6";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "3 15\n" +
                "12\n" +
                "5\n" +
                "1";
        String output = "3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
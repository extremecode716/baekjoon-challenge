package baekjoon.problem.p2525;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 오븐 시계
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2525">https://www.acmicpc.net/problem/2525</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "14 30\n" +
                "20";
        String output = "14 50";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "17 40\n" +
                "80";
        String output = "19 0";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "23 48\n" +
                "25";
        String output = "0 13";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
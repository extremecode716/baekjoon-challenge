package baekjoon.problem.p2108;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 통계학
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2108">https://www.acmicpc.net/problem/2108</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5\n" +
                "1\n" +
                "3\n" +
                "8\n" +
                "-2\n" +
                "2";
        String output = "2\n" +
                "2\n" +
                "1\n" +
                "10";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "1\n" +
                "4000";
        String output = "4000\n" +
                "4000\n" +
                "4000\n" +
                "0";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "5\n" +
                "-1\n" +
                "-2\n" +
                "-3\n" +
                "-1\n" +
                "-2";
        String output = "-2\n" +
                "-2\n" +
                "-1\n" +
                "2";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "3\n" +
                "0\n" +
                "0\n" +
                "-1";
        String output = "0\n" +
                "0\n" +
                "0\n" +
                "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase5() {
        String input = "3\n" +
                "1\n" +
                "2\n" +
                "3";
        String output = "2\n" +
                "2\n" +
                "2\n" +
                "2";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
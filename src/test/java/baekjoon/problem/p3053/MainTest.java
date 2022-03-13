package baekjoon.problem.p3053;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 택시 기하학<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/3053">https://www.acmicpc.net/problem/3053</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "1";
        String output = "3.141593\n" +
                "2.000000";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "21";
        String output = "1385.442360\n" +
                "882.000000";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "42";
        String output = "5541.769441\n" +
                "3528.000000";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
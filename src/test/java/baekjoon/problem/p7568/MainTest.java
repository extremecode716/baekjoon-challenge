package baekjoon.problem.p7568;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 덩치
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/7568">https://www.acmicpc.net/problem/7568</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5\n" +
                "55 185\n" +
                "58 183\n" +
                "88 186\n" +
                "60 175\n" +
                "46 155";
        String output = "2 2 1 2 5";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "3\n" +
                "55 185\n" +
                "55 185\n" +
                "88 186";
        String output = "2 2 1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
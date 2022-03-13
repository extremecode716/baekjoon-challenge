package baekjoon.problem.p2581;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 소수<p>
 * 에라토스테네스의 체
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2581">https://www.acmicpc.net/problem/2581</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "60\n" +
                "100";
        String output = "620\n" +
                "61";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "64\n" +
                "65";
        String output = "-1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p8958;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * OX퀴즈<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/8958">https://www.acmicpc.net/problem/8958</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5\n" +
                "OOXXOXXOOO\n" +
                "OOXXOOXXOO\n" +
                "OXOXOXOXOXOXOX\n" +
                "OOOOOOOOOO\n" +
                "OOOOXOOOOXOOOOX";
        String output = "10\n" +
                "9\n" +
                "7\n" +
                "55\n" +
                "30";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
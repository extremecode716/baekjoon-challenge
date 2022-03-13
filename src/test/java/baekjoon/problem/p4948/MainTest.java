package baekjoon.problem.p4948;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 베르트랑 공준<p>
 * 에라토스테네스의 체
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4948">https://www.acmicpc.net/problem/4948</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "1\n" +
                "10\n" +
                "13\n" +
                "100\n" +
                "1000\n" +
                "10000\n" +
                "100000\n" +
                "0";
        String output = "1\n" +
                "4\n" +
                "3\n" +
                "21\n" +
                "135\n" +
                "1033\n" +
                "8392";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
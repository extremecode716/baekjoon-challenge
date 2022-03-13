package baekjoon.problem.p10757;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 큰 수 A+B<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10757">https://www.acmicpc.net/problem/10757</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "9223372036854775807 9223372036854775808";
        String output = "18446744073709551615";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p10815;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 숫자 카드
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10815">https://www.acmicpc.net/problem/10815</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5\n" +
                "6 3 2 10 -10\n" +
                "8\n" +
                "10 9 -5 2 3 4 5 -10";
        String output = "1 0 0 1 1 0 0 1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p11650;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 좌표 정렬하기<p>
 * union-find
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11650">https://www.acmicpc.net/problem/11650</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5\n" +
                "3 4\n" +
                "1 1\n" +
                "1 -1\n" +
                "2 2\n" +
                "3 3";
        String output = "1 -1\n" +
                "1 1\n" +
                "2 2\n" +
                "3 3\n" +
                "3 4";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
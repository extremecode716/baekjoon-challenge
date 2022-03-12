package baekjoon.problem.p18870;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 좌표 압축<p>
 * 정렬
 * 값 / 좌표 압축
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/18870">https://www.acmicpc.net/problem/18870</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5\n" +
                "2 4 -10 4 -9";
        String output = "2 3 0 3 1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "6\n" +
                "1000 999 1000 999 1000 999";
        String output = "1 0 1 0 1 0";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
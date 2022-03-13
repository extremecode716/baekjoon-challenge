package baekjoon.problem.p4153;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 직각삼각형<p>
 * 피타고라스의 정리
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4153">https://www.acmicpc.net/problem/4153</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "6 8 10\n" +
                "25 52 60\n" +
                "5 12 13\n" +
                "0 0 0";
        String output = "right\n" +
                "wrong\n" +
                "right";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p5575;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 타임 카드
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/5575">https://www.acmicpc.net/problem/5575</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "9 0 0 18 0 0\n" +
                "9 0 1 18 0 0\n" +
                "12 14 52 12 15 30";
        String output = "9 0 0\n" +
                "8 59 59\n" +
                "0 0 38";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
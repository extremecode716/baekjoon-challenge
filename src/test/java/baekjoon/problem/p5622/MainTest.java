package baekjoon.problem.p5622;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 다이얼
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/5622">https://www.acmicpc.net/problem/5622</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "WA";
        String output = "13";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "UNUCIC";
        String output = "36";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p11401;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 이항 계수 3
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11401">https://www.acmicpc.net/problem/11401</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5 2";
        String output = "10";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
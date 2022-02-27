package baekjoon.problem.p2231;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 분해합
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2231">https://www.acmicpc.net/problem/2231</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "216";
        String output = "198";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
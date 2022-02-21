package baekjoon.problem.p10870;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 피보나치 수 5
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10870">https://www.acmicpc.net/problem/10870</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "10";
        String output = "55";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
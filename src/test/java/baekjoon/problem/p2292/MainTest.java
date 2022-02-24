package baekjoon.problem.p2292;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 벌집
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2292">https://www.acmicpc.net/problem/2292</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "13";
        String output = "3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "1";
        String output = "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

}
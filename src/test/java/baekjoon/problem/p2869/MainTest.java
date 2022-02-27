package baekjoon.problem.p2869;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 달팽이는 올라가고 싶다
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2869">https://www.acmicpc.net/problem/2869</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2 1 5";
        String output = "4";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "5 1 6";
        String output = "2";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "100 99 1000000000";
        String output = "999999901";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p1330;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 두 수 비교하기
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1330">https://www.acmicpc.net/problem/1330</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "1 2";
        String output = "<";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "10 2";
        String output = ">";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "5 5";
        String output = "==";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
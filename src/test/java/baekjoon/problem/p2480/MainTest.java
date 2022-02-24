package baekjoon.problem.p2480;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 주사위 세개
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2480">https://www.acmicpc.net/problem/2480</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "3 3 6";
        String output = "1300";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "2 2 2";
        String output = "12000";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "6 2 5";
        String output = "600";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

}
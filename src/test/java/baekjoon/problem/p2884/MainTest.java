package baekjoon.problem.p2884;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 알람 시계
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2884">https://www.acmicpc.net/problem/2884</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "10 10";
        String output = "9 25";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "0 30";
        String output = "23 45";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "23 40";
        String output = "22 55";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
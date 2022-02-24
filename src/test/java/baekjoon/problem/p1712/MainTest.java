package baekjoon.problem.p1712;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 손익분기점
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1712">https://www.acmicpc.net/problem/1712</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "1000 70 170";
        String output = "11";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "3 2 1";
        String output = "-1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "2100000000 9 10";
        String output = "2100000001";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
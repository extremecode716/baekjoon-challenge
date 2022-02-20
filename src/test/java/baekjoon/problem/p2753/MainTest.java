package baekjoon.problem.p2753;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 윤년
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2753">https://www.acmicpc.net/problem/2753</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2000";
        String output = "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "1999";
        String output = "0";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
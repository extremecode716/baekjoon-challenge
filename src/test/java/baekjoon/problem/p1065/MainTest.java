package baekjoon.problem.p1065;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 한수
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1065">https://www.acmicpc.net/problem/1065</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "110";
        String output = "99";

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

    @Test
    void testCase3() {
        String input = "210";
        String output = "105";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "1000";
        String output = "144";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase5() {
        String input = "500";
        String output = "119";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
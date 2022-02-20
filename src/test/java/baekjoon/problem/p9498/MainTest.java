package baekjoon.problem.p9498;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 시험 성적
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/9498">https://www.acmicpc.net/problem/9498</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "100";
        String output = "A";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "-100";
        String output = "F";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "70";
        String output = "C";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "89";
        String output = "B";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase5() {
        String input = "60";
        String output = "D";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
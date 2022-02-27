package baekjoon.problem.p1157;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 단어 공부
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1157">https://www.acmicpc.net/problem/1157</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "Mississipi";
        String output = "?";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "zZa";
        String output = "Z";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "z";
        String output = "Z";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "baaa";
        String output = "A";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p2908;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 상수
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2908">https://www.acmicpc.net/problem/2908</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "734 893";
        String output = "437";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "221 231";
        String output = "132";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "839 237";
        String output = "938";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
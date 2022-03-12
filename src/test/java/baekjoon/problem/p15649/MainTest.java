package baekjoon.problem.p15649;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * N과 M (1)<p>
 * 백트래킹
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/15649">https://www.acmicpc.net/problem/15649</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "3 1";
        String output = "1\n" +
                "2\n" +
                "3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "4 2";
        String output = "1 2\n" +
                "1 3\n" +
                "1 4\n" +
                "2 1\n" +
                "2 3\n" +
                "2 4\n" +
                "3 1\n" +
                "3 2\n" +
                "3 4\n" +
                "4 1\n" +
                "4 2\n" +
                "4 3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "4 4";
        String output = "1 2 3 4\n" +
                "1 2 4 3\n" +
                "1 3 2 4\n" +
                "1 3 4 2\n" +
                "1 4 2 3\n" +
                "1 4 3 2\n" +
                "2 1 3 4\n" +
                "2 1 4 3\n" +
                "2 3 1 4\n" +
                "2 3 4 1\n" +
                "2 4 1 3\n" +
                "2 4 3 1\n" +
                "3 1 2 4\n" +
                "3 1 4 2\n" +
                "3 2 1 4\n" +
                "3 2 4 1\n" +
                "3 4 1 2\n" +
                "3 4 2 1\n" +
                "4 1 2 3\n" +
                "4 1 3 2\n" +
                "4 2 1 3\n" +
                "4 2 3 1\n" +
                "4 3 1 2\n" +
                "4 3 2 1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
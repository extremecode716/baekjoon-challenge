package baekjoon.problem.p18258;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 큐 2<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/18258">https://www.acmicpc.net/problem/18258</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "15\n" +
                "push 1\n" +
                "push 2\n" +
                "front\n" +
                "back\n" +
                "size\n" +
                "empty\n" +
                "pop\n" +
                "pop\n" +
                "pop\n" +
                "size\n" +
                "empty\n" +
                "pop\n" +
                "push 3\n" +
                "empty\n" +
                "front";
        String output = "1\n" +
                "2\n" +
                "2\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "-1\n" +
                "0\n" +
                "1\n" +
                "-1\n" +
                "0\n" +
                "3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
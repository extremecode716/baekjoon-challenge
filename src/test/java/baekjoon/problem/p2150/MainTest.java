package baekjoon.problem.p2150;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * Strongly Connected Component<p>
 * SCC
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2150">https://www.acmicpc.net/problem/2150</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "7 9\n" +
                "1 4\n" +
                "4 5\n" +
                "5 1\n" +
                "1 6\n" +
                "6 7\n" +
                "2 7\n" +
                "7 3\n" +
                "3 7\n" +
                "7 2";
        String output = "3\n" +
                "1 4 5 -1\n" +
                "2 3 7 -1\n" +
                "6 -1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
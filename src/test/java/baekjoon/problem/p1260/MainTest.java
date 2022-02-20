package baekjoon.problem.p1260;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * DFS와 BFS
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1260">https://www.acmicpc.net/problem/1260</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "4 5 1\n" +
                "1 2\n" +
                "1 3\n" +
                "1 4\n" +
                "2 4\n" +
                "3 4";
        String output = "1 2 4 3\n" +
                "1 2 3 4";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase2() {
        String input = "5 5 3\n" +
                "5 4\n" +
                "5 2\n" +
                "1 2\n" +
                "3 4\n" +
                "3 1";
        String output = "3 1 2 5 4\n" +
                "3 1 4 2 5";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase3() {
        String input = "1000 1 1000\n" +
                "999 1000";
        String output = "1000 999\n" +
                "1000 999";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }
}

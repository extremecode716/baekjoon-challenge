package baekjoon.problem.p4196;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 도미노<p>
 * SCC - 코라사주 알고리즘
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4196">https://www.acmicpc.net/problem/4196</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "1\n" +
                "3 2\n" +
                "1 2\n" +
                "2 3";
        String output = "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "1\n" +
                "6 7\n" +
                "1 2\n" +
                "2 3\n" +
                "3 1\n" +
                "4 5\n" +
                "5 6\n" +
                "6 4\n" +
                "6 3";
        String output = "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "1\n" +
                "10 6\n" +
                "9 4\n" +
                "9 7\n" +
                "9 1\n" +
                "8 7\n" +
                "3 7\n" +
                "4 9";
        String output = "7";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "1\n" +
                "4 7\n" +
                "2 1\n" +
                "2 3\n" +
                "3 2\n" +
                "3 4\n" +
                "4 3\n" +
                "4 2\n" +
                "2 4";
        String output = "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
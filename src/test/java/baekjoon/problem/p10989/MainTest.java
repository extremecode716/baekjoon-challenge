package baekjoon.problem.p10989;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 수 정렬하기 3
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10989">https://www.acmicpc.net/problem/10989</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "10\n" +
                "5\n" +
                "2\n" +
                "3\n" +
                "1\n" +
                "4\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "1\n" +
                "7";
        String output = "1\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "3\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "5\n" +
                "7";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "5\n" +
                "5\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "1";
        String output = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
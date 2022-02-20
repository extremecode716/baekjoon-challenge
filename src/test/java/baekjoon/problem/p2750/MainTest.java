package baekjoon.problem.p2750;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 수 정렬하기
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2750">https://www.acmicpc.net/problem/2750</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
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

    @Test
    void testCase2() {
        String input = "5\n" +
                "100\n" +
                "25\n" +
                "1964\n" +
                "80\n" +
                "1";
        String output = "1\n" +
                "25\n" +
                "80\n" +
                "100\n" +
                "1964";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
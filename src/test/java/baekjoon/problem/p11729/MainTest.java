package baekjoon.problem.p11729;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 하노이 탑 이동 순서
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11729">https://www.acmicpc.net/problem/11729</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "3";
        String output = "7\n" +
                "1 3\n" +
                "1 2\n" +
                "3 2\n" +
                "1 3\n" +
                "2 1\n" +
                "2 3\n" +
                "1 3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "3";
        String output = "7\n" +
                "1 3\n" +
                "1 2\n" +
                "3 2\n" +
                "1 3\n" +
                "2 1\n" +
                "2 3\n" +
                "1 3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

}
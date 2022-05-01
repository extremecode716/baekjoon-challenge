package baekjoon.problem.p11659;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 구간 합 구하기 4
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11659">https://www.acmicpc.net/problem/11659</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5 3\n" +
                "5 4 3 2 1\n" +
                "1 3\n" +
                "2 4\n" +
                "5 5";
        String output = "12\n" +
                "9\n" +
                "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
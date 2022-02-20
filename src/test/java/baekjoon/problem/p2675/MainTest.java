package baekjoon.problem.p2675;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 문자열 반복
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2675">https://www.acmicpc.net/problem/2675</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2\n" +
                "3 ABC\n" +
                "5 /HTP";
        String output = "AAABBBCCC\n" +
                "/////HHHHHTTTTTPPPPP";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
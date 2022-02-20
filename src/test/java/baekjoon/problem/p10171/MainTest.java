package baekjoon.problem.p10171;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 고양이
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10171">https://www.acmicpc.net/problem/10171</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "";
        String output = "\\    /\\\n" +
                " )  ( ')\n" +
                "(  /  )\n" +
                " \\(__)|";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }
}
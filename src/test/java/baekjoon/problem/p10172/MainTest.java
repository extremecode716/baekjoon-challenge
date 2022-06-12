package baekjoon.problem.p10172;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 개
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10172">https://www.acmicpc.net/problem/10172</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "";
        String output = "|\\_/|\n" +
                "|q p|   /}\n" +
                "( 0 )\"\"\"\\\n" +
                "|\"^\"`    |\n" +
                "||_/=\\\\__|";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
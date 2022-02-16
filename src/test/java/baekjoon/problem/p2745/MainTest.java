package baekjoon.problem.p2745;

import baekjoon.ExtremeCodeTest;
import org.junit.jupiter.api.Test;

/**
 * 진법 변환
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2745">https://www.acmicpc.net/problem/2745</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "ZZZZZ 36";
        String output = "60466175";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase2() {
        String input = "11011 2";
        String output = "27";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase3() {
        String input = "12B4A6 32";
        String output = "36016454";

        ExtremeCodeTest.MainTest(input, output, MainTest::main);
    }
}

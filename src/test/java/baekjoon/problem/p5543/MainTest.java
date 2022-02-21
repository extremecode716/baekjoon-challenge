package baekjoon.problem.p5543;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 상근날드
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/5543">https://www.acmicpc.net/problem/5543</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "800\n" +
                "700\n" +
                "900\n" +
                "198\n" +
                "330";
        String output = "848";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "1999\n" +
                "1999\n" +
                "100\n" +
                "189\n" +
                "100";
        String output = "150";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
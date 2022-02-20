package baekjoon.problem.p2588;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 곱셈
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2588">https://www.acmicpc.net/problem/2588</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "472\n" +
                "385";
        String output = "2360\n" +
                "3776\n" +
                "1416\n" +
                "181720";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
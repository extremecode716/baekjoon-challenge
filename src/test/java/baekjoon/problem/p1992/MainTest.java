package baekjoon.problem.p1992;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 쿼드트리
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1992">https://www.acmicpc.net/problem/1992</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "8\n" +
                "11110000\n" +
                "11110000\n" +
                "00011100\n" +
                "00011100\n" +
                "11110000\n" +
                "11110000\n" +
                "11110011\n" +
                "11110011";
        String output = "((110(0101))(0010)1(0001))";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
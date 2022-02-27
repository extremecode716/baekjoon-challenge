package baekjoon.problem.p10926;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * ??!
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10926">https://www.acmicpc.net/problem/10926</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "joonas";
        String output = "joonas??!";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p16943;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 숫자 재배치
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/16943">https://www.acmicpc.net/problem/16943</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "1234 3456";
        String output = "3421";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "1000 5";
        String output = "-1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "789 123";
        String output = "-1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

}
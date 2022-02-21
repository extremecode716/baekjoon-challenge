package baekjoon.problem.p2447;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 별 찍기 - 10
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2447">https://www.acmicpc.net/problem/2447</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "3";
        String output = "***\n" +
                "* *\n" +
                "***";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "27";
        String output = "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "***   ******   ******   ***\n" +
                "* *   * ** *   * ** *   * *\n" +
                "***   ******   ******   ***\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "*********         *********\n" +
                "* ** ** *         * ** ** *\n" +
                "*********         *********\n" +
                "***   ***         ***   ***\n" +
                "* *   * *         * *   * *\n" +
                "***   ***         ***   ***\n" +
                "*********         *********\n" +
                "* ** ** *         * ** ** *\n" +
                "*********         *********\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "***   ******   ******   ***\n" +
                "* *   * ** *   * ** *   * *\n" +
                "***   ******   ******   ***\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
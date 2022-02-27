package baekjoon.problem.p1436;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 영화감독 숌
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1436">https://www.acmicpc.net/problem/1436</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2";
        String output = "1666";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "3";
        String output = "2666";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "6";
        String output = "5666";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "187";
        String output = "66666";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase5() {
        String input = "500";
        String output = "166699";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

}
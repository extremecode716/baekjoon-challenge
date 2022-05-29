package baekjoon.problem.p12015;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 가장 긴 증가하는 부분 수열 2
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "6\n" +
                "10 20 10 30 20 50";
        String output = "4";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
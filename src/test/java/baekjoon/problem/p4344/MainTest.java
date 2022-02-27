package baekjoon.problem.p4344;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 평균은 넘겠지
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4344">https://www.acmicpc.net/problem/4344</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5\n" +
                "5 50 50 70 80 100\n" +
                "7 100 95 90 80 70 60 50\n" +
                "3 70 90 80\n" +
                "3 70 90 81\n" +
                "9 100 99 98 97 96 95 94 93 91";
        String output = "40.000%\n" +
                "57.143%\n" +
                "33.333%\n" +
                "66.667%\n" +
                "55.556%";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "1\n" +
                "11 0 0 0 0 0 0 0 0 0 0 1";
        String output = "9.091%";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "1\n" +
                "11 0 0 0 0 0 0 0 0 0 0 0";
        String output = "0.000%";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "1\n" +
                "2 100 100";
        String output = "0.000%";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase5() {
        String input = "1\n" +
                "5 5 5 6 7 8";
        String output = "40.000%";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
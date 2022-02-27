package baekjoon.problem.p1018;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 체스판 다시 칠하기
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1018">https://www.acmicpc.net/problem/1018</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "8 8\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBBBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW";
        String output = "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "10 13\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "WWWWWWWWWWBWB\n" +
                "WWWWWWWWWWBWB";
        String output = "12";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "8 8\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB";
        String output = "0";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "9 23\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBW";
        String output = "31";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase5() {
        String input = "10 10\n" +
                "BBBBBBBBBB\n" +
                "BBWBWBWBWB\n" +
                "BWBWBWBWBB\n" +
                "BBWBWBWBWB\n" +
                "BWBWBWBWBB\n" +
                "BBWBWBWBWB\n" +
                "BWBWBWBWBB\n" +
                "BBWBWBWBWB\n" +
                "BWBWBWBWBB\n" +
                "BBBBBBBBBB";
        String output = "0";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase6() {
        String input = "8 8\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBBBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWWWB\n" +
                "BWBWBWBW";
        String output = "2";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase7() {
        String input = "11 12\n" +
                "BWWBWWBWWBWW\n" +
                "BWWBWBBWWBWW\n" +
                "WBWWBWBBWWBW\n" +
                "BWWBWBBWWBWW\n" +
                "WBWWBWBBWWBW\n" +
                "BWWBWBBWWBWW\n" +
                "WBWWBWBBWWBW\n" +
                "BWWBWBWWWBWW\n" +
                "WBWWBWBBWWBW\n" +
                "BWWBWBBWWBWW\n" +
                "WBWWBWBBWWBW";
        String output = "15";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
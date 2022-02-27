package baekjoon.problem.p1152;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 단어의 개수
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1152">https://www.acmicpc.net/problem/1152</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "The Curious Case of Benjamin Button";
        String output = "6";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = " The first character is a blank";
        String output = "6";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "The last character is a blank ";
        String output = "6";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
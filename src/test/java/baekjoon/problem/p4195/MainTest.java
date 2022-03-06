package baekjoon.problem.p4195;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 친구 네트워크
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4195">https://www.acmicpc.net/problem/4195</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2\n" +
                "3\n" +
                "Fred Barney\n" +
                "Barney Betty\n" +
                "Betty Wilma\n" +
                "3\n" +
                "Fred Barney\n" +
                "Betty Wilma\n" +
                "Barney Betty";
        String output = "2\n" +
                "3\n" +
                "4\n" +
                "2\n" +
                "2\n" +
                "4";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
package baekjoon.problem.p14425;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 문자열 집합
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/14425">https://www.acmicpc.net/problem/14425</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "5 11\n" +
                "baekjoononlinejudge\n" +
                "startlink\n" +
                "codeplus\n" +
                "sundaycoding\n" +
                "codingsh\n" +
                "baekjoon\n" +
                "codeplus\n" +
                "codeminus\n" +
                "startlink\n" +
                "starlink\n" +
                "sundaycoding\n" +
                "codingsh\n" +
                "codinghs\n" +
                "sondaycoding\n" +
                "startrink\n" +
                "icerink";
        String output = "4";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
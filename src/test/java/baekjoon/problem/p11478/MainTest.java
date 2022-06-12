package baekjoon.problem.p11478;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 서로 다른 부분 문자열의 개수
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11478">https://www.acmicpc.net/problem/11478</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "ababc";
        String output = "12";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}
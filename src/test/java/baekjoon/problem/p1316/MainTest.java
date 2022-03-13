package baekjoon.problem.p1316;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 그룹 단어 체커<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1316">https://www.acmicpc.net/problem/1316</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "3\n" +
                "happy\n" +
                "new\n" +
                "year";
        String output = "3";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase2() {
        String input = "4\n" +
                "aba\n" +
                "abab\n" +
                "abcabc\n" +
                "a";
        String output = "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase3() {
        String input = "5\n" +
                "ab\n" +
                "aa\n" +
                "aca\n" +
                "ba\n" +
                "bb";
        String output = "4";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase4() {
        String input = "2\n" +
                "yzyzy\n" +
                "zyzyz";
        String output = "0";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }

    @Test
    void testCase5() {
        String input = "1\n" +
                "z";
        String output = "1";

        BaekjoonTest.MainTest(input, output, MainTest::main);
    }
}
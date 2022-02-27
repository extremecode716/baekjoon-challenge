package baekjoon.problem.p1181;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 단어 정렬
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1181">https://www.acmicpc.net/problem/1181</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "13\n" +
                "but\n" +
                "i\n" +
                "wont\n" +
                "hesitate\n" +
                "no\n" +
                "more\n" +
                "no\n" +
                "more\n" +
                "it\n" +
                "cannot\n" +
                "wait\n" +
                "im\n" +
                "yours";
        String output = "i\n" +
                "im\n" +
                "it\n" +
                "no\n" +
                "but\n" +
                "more\n" +
                "wait\n" +
                "wont\n" +
                "yours\n" +
                "cannot\n" +
                "hesitate";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

}
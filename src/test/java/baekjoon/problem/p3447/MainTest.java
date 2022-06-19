package baekjoon.problem.p3447;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 버그왕<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/3447">https://www.acmicpc.net/problem/3447</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "print \"No bugs here...\"\n" +
                "\n" +
                "void hello() {\n" +
                "BUGBUG\n" +
                "printfBUG(\"Hello, world!\\n\");\n" +
                "}\n" +
                "\n" +
                "wriBUGBUGtelBUGn(\"Hello B-U-G\");";
        String output = "print \"No bugs here...\"\n" +
                "\n" +
                "void hello() {\n" +
                "\n" +
                "printf(\"Hello, world!\\n\");\n" +
                "}\n" +
                "\n" +
                "writeln(\"Hello B-U-G\");";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

}
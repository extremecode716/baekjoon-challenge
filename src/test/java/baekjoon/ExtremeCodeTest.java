package baekjoon;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 테스트 구조 클래스
 *
 * @author extreme code
 */
public class ExtremeCodeTest {
    @FunctionalInterface
    public interface Main {
        void run();
    }

    public static ByteArrayOutputStream getSystemOutputStream(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        return outputStream;
    }

    public static void MainTest(String input, String output, Main main) {
        output += "\r\n";
        ByteArrayOutputStream systemOutputStream = ExtremeCodeTest.getSystemOutputStream(input);

        main.run();

        assertThat(systemOutputStream.toString()).hasToString(output);
    }
}

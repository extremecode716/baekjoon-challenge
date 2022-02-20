package baekjoon;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 테스트용 클래스
 *
 * @author extreme code
 */
@Slf4j
public class BaekjoonTest {
    @FunctionalInterface
    public interface Main {
        void run();
    }

    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.####");
    private static final String lineSeparator = System.lineSeparator();

    private static InputStream originInputStream;
    private static PrintStream originPrintStream;
    private static long runtime;

    public static ByteArrayOutputStream getSystemOutputStream(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        return outputStream;
    }

    public static void MainTest(String input, String output, Main main) {
        saveOriginInoutAndPrintStream();
        ByteArrayOutputStream systemOutputStream = BaekjoonTest.getSystemOutputStream(input);

        long startTime = System.nanoTime();
        main.run();
        runtime = System.nanoTime() - startTime;

        assertThat(systemOutputStream.toString().replace(lineSeparator, "\n")).hasToString(output + "\n");
        loadOriginInoutAndPrintStream();
    }

    public static void printRuntime() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        log.info("{} {} | runtime: {} ms", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), DECIMAL_FORMAT.format(runtime / 1e6));
    }

    private static void saveOriginInoutAndPrintStream() {
        originInputStream = System.in;
        originPrintStream = System.out;
    }

    private static void loadOriginInoutAndPrintStream() {
        System.setIn(originInputStream);
        System.setOut(originPrintStream);
    }
}

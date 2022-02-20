package leetcode;

import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;

/**
 * 테스트 구조 클래스
 *
 * @author extreme code
 */
@Slf4j
public class LeetcodeTest {
    @FunctionalInterface
    public interface Main {
        void run();
    }

    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.####");

    private static long runtime;

    public static void MainTest(Main main) {
        long startTime = System.nanoTime();
        main.run();
        runtime = System.nanoTime() - startTime;
    }

    public static void printRuntime() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        log.info("{} {} | runtime: {} ms", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), DECIMAL_FORMAT.format(runtime / 1e6));
    }
}

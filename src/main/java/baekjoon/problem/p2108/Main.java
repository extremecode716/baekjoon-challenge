package baekjoon.problem.p2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;

/**
 * 통계학
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2108">https://www.acmicpc.net/problem/2108</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int N = Integer.parseInt(Algorithm.readLine());
        final List<String> inputs = Algorithm.readLines(N);
        final StringBuilder stringBuilder = new StringBuilder();
        final Map<Integer, Integer> numberCountMap = new TreeMap<>(Integer::compare);
        final Map<Integer, Set<Integer>> countMap = new TreeMap<>(Integer::compare);

        int arithmeticAverage = 0;
        AtomicInteger median = new AtomicInteger();
        int mode = 0;
        int scope = 0;

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;

        for (String input : inputs) {
            Integer number = Integer.parseInt(input);
            Integer numberCount = numberCountMap.merge(number, 1, Integer::sum);
            sum += number;
            max = Math.max(max, number);
            min = Math.min(min, number);
            maxCount = Math.max(maxCount, numberCount);
            if (maxCount == numberCount) {
                if (countMap.containsKey(numberCount)) {
                    countMap.get(numberCount).add(number);
                } else {
                    TreeSet<Integer> treeSet = new TreeSet<>();
                    treeSet.add(number);
                    countMap.put(numberCount, treeSet);
                }
            }
        }

        arithmeticAverage = (int) Math.round((float) sum / N);
        MedianBiConsumer medianBiConsumer = new MedianBiConsumer(N, median);
        try {
            numberCountMap.forEach(medianBiConsumer);
        } catch (BreakException breakException) {
        }
        Set<Integer> countSet = countMap.get(maxCount);
        if (countSet.size() == 1) {
            mode = countSet.stream().findFirst().get();
        } else if (countSet.size() > 1) {
            mode = countSet.stream().skip(1).findFirst().get();
        }
        scope = max - min;


        stringBuilder.append(arithmeticAverage).append("\n").append(median).append("\n").append(mode).append("\n").append(scope);
        System.out.println(stringBuilder);
    }
}

class MedianBiConsumer implements BiConsumer<Integer, Integer> {
    private final int N;
    private final AtomicInteger median;
    private final int medianPos;

    private int sumCount;
    private int modeCount;

    public MedianBiConsumer(int N, AtomicInteger median) {
        this.N = N;
        this.median = median;
        this.medianPos = (N + 1) / 2;
        sumCount = 0;
        modeCount = 0;
    }

    @Override
    public void accept(Integer number, Integer count) {
        this.sumCount += count;
        if (medianPos <= this.sumCount) {
            this.median.set(number);
            throw new BreakException();
        }
    }
}

class BreakException extends RuntimeException {

    public BreakException() {
        super(null, null, false, false);
    }

    public BreakException(String message) {
        super(message, null, false, false);
    }

    public BreakException(String message, Throwable cause) {
        super(message, cause, false, false);
    }

    public BreakException(Throwable cause) {
        super(null, cause, false, false);
    }
}

/**
 * 백준에 제출하기 위해 문제의 Main 클래스로 복사 이동하여 사용됩니다.
 *
 * @author extreme code
 */
class Algorithm {
    @FunctionalInterface
    public interface Solution {
        void solve();
    }

    private static BufferedReader bufferedReader;

    public static String readLine() {
        bufferedReader = bufferedReader == null ? new BufferedReader(new InputStreamReader(System.in)) : bufferedReader;
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }

    public static List<String> readLines(final int readCount) {
        bufferedReader = bufferedReader == null ? new BufferedReader(new InputStreamReader(System.in)) : bufferedReader;
        List<String> lines = new ArrayList<>();
        try {
            int count = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
                ++count;
                if (count == readCount)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void close() {
        if (null == bufferedReader)
            return;
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader = null;
        }
    }

    public static void solve(Solution solution) {
        solution.solve();
        close();
    }
}
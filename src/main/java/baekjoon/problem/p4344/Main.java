package baekjoon.problem.p4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;

/**
 * 평균은 넘겠지
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4344">https://www.acmicpc.net/problem/4344</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int testCase = Integer.parseInt(Algorithm.readLine());
        final List<String> inputs = Algorithm.readLines(testCase);
        final StringBuilder stringBuilder = new StringBuilder();

        final DecimalFormat decimalFormat = new DecimalFormat("0.000");
        final int maxSize = 101;
        for (int i = 0; i < testCase; ++i) {
            final String[] split = inputs.get(i).split("\\s+");
            final int N = Integer.parseInt(split[0]);

            final int[] scores = new int[maxSize];
            int sum = 0;
            double average = 0;
            for (int j = 1; j <= N; ++j) {
                int score = Integer.parseInt(split[j]);
                ++scores[score];
                sum += score;
            }
            average = Math.ceil(sum / (double) N + 0.0001d);
            int averageUpCount = 0;
            double averageUpPercent = 0;
            for (int score = (int) average; score < maxSize; ++score) {
                averageUpCount += scores[score];
            }
            averageUpPercent = averageUpCount / (double) N * 100;
            stringBuilder.append(decimalFormat.format(averageUpPercent)).append("%\n");
        }

        System.out.print(stringBuilder);
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
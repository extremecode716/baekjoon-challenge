package baekjoon.problem.p4447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 좋은놈 나쁜놈<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4447">https://www.acmicpc.net/problem/4447</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static final String LINE_SEPARATOR = System.lineSeparator();

    private static void solution() {
        final int n = Integer.parseInt(Algorithm.readLine());
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            final String line = Algorithm.readLine();
            stringBuilder.append(line).append(" is ");
            final char[] chars = line.toCharArray();
            int gCount = 0, bCount = 0;
            for (int c = 0; c < chars.length; ++c) {
                switch (chars[c]) {
                    case 'g':
                    case 'G':
                        ++gCount;
                        break;
                    case 'b':
                    case 'B':
                        ++bCount;
                        break;
                }
            }
            if (gCount > bCount) {
                stringBuilder.append("GOOD");
            } else if (gCount == bCount) {
                stringBuilder.append("NEUTRAL");
            } else {
                stringBuilder.append("A BADDY");
            }
            stringBuilder.append(LINE_SEPARATOR);
        }

        System.out.print(stringBuilder);
    }
}

/**
 * Algorithm 클래스는 백준 문제의 Main 클래스로 복사 - 붙여넣기하여 사용합니다.
 *
 * @author extreme code
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
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
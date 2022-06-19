package baekjoon.problem.p6581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * HTML
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/6581">https://www.acmicpc.net/problem/6581</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String HR = "--------------------------------------------------------------------------------";
    private static final int MAX_LENGTH = 80;

    private static void solution() {
        final StringBuilder stringBuilder = new StringBuilder();

        int continuousBRCount = 0;
        int length = 0;
        String input = null;
        while ((input = Algorithm.readLine()) != null) {
            final StringTokenizer stringTokenizer = new StringTokenizer(input);
            while (stringTokenizer.hasMoreTokens()) {
                final String nextToken = stringTokenizer.nextToken();
                switch (nextToken) {
                    case "<br>":
                        ++continuousBRCount;
                        if (continuousBRCount > 2) break;
                        if (length > 0) {
                            stringBuilder.setLength(stringBuilder.length() - 1);
                        }
                        stringBuilder.append(LINE_SEPARATOR);
                        length = 0;
                        break;
                    case "<hr>":
                        continuousBRCount = 0;
                        if (length > 0) {
                            stringBuilder.setLength(stringBuilder.length() - 1);
                            stringBuilder.append(LINE_SEPARATOR);
                        }
                        stringBuilder.append(HR).append(LINE_SEPARATOR);
                        length = 0;
                        break;
                    default:
                        continuousBRCount = 0;
                        final int lengthTmp = length + nextToken.length();
                        if (lengthTmp >= MAX_LENGTH) {
                            stringBuilder.setLength(stringBuilder.length() - 1);
                            stringBuilder.append(LINE_SEPARATOR);
                            length = 0;
                        }
                        length += nextToken.length() + 1;
                        stringBuilder.append(nextToken).append(" ");
                        break;
                }
            }
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        System.out.println(stringBuilder);
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
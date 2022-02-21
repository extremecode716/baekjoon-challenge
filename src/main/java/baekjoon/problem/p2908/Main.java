package baekjoon.problem.p2908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 상수
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2908">https://www.acmicpc.net/problem/2908</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        try (final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            final String input = Algorithm.readLine();
            String[] split = input.split("\\s+");
            String reverseStr1 = reverse(split[0]);
            String reverseStr2 = reverse(split[1]);

            // 세 자리 고정임으로 compareTo 비교 처리
            bw.write((reverseStr1.compareTo(reverseStr2) > 0 ? reverseStr1 : reverseStr2) + "\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String reverse(String str) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; --i) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
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
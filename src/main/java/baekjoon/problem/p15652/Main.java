package baekjoon.problem.p15652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * N과 M (4)<p>
 * 백트래킹
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/15652">https://www.acmicpc.net/problem/15652</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }


    private static int[] array;
    private static boolean[] visit;
    private static StringBuilder stringBuilder;

    private static void solution() {
        final String line = Algorithm.readLine();
        final StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
        final int N = Integer.parseInt(stringTokenizer.nextToken());
        final int M = Integer.parseInt(stringTokenizer.nextToken());

        array = new int[M];
        stringBuilder = new StringBuilder();
        dfs(N, M, 0, 0);

        System.out.print(stringBuilder);
    }

    public static void dfs(int N, int M, int start, int depth) {
        if (depth == M) {
            for (int value : array) {
                stringBuilder.append(value).append(' ');
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.setLength(stringBuilder.length() - 1);
            }
            stringBuilder.append('\n');
            return;
        }

        for (int i = start; i < N; i++) {
            array[depth] = i + 1;
            dfs(N, M, i, depth + 1);
        }
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
package baekjoon.problem.p11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 구간 합 구하기 4
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11659">https://www.acmicpc.net/problem/11659</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final String line1 = Algorithm.readLine();
        final String line2 = Algorithm.readLine();
        final StringTokenizer stringTokenizer1 = new StringTokenizer(line1, " ");
        final StringTokenizer stringTokenizer2 = new StringTokenizer(line2, " ");
        final int N = Integer.parseInt(stringTokenizer1.nextToken());
        final int M = Integer.parseInt(stringTokenizer1.nextToken());
        final int[] intervalSum = new int[N];
        for(int i = 0, sum = 0; stringTokenizer2.hasMoreTokens(); ++i) {
            int number = Integer.parseInt(stringTokenizer2.nextToken());
            sum += number;
            intervalSum[i] = sum;
        }

        for(int n = 0; n < M; ++n) {
            final String[] intervalArr = Algorithm.readLine().split(" ");
            final int i = Integer.parseInt(intervalArr[0]) - 2;
            final int j = Integer.parseInt(intervalArr[1]) - 1;

            final int result = intervalSum[j] - ((i >= 0) ? intervalSum[i] : 0);
            System.out.println(result);
        }
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
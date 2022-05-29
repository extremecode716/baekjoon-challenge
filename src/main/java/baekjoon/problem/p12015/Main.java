package baekjoon.problem.p12015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 가장 긴 증가하는 부분 수열 2
 *
 * @see <a href="https://www.acmicpc.net/problem/12015">https://www.acmicpc.net/problem/12015</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int sequenceSize = Integer.parseInt(Algorithm.readLine());
        final StringTokenizer stringTokenizer = new StringTokenizer(Algorithm.readLine(), " ");
        final int[] sequenceNumbers = new int[sequenceSize];
        List<Integer> list = new ArrayList<>();
        list.add(0);

        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            int number = sequenceNumbers[i++] = Integer.parseInt(stringTokenizer.nextToken());
            if (number > list.get(list.size() - 1)) {
                list.add(number);
            } else {
                // 이분탐색
                int left = 0;
                int right = list.size() - 1;

                while (left < right) {
                    int mid = (left + right) >> 1;
                    if (list.get(mid) >= number) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                list.set(right, number);
            }
        }
        System.out.println(list.size() - 1);
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
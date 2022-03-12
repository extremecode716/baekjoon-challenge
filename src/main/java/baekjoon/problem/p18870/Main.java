package baekjoon.problem.p18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 좌표 압축<p>
 * 정렬
 * 값 / 좌표 압축
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/18870">https://www.acmicpc.net/problem/18870</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int N = Integer.parseInt(Algorithm.readLine());
        final String xStringList = Algorithm.readLine();
        final StringTokenizer stringTokenizer = new StringTokenizer(xStringList, " ");
        final List<Integer> xOriginList = new ArrayList<>();
        final Set<Integer> xSortSet = new TreeSet<>();

        while (stringTokenizer.hasMoreTokens()) {
            int x = Integer.parseInt(stringTokenizer.nextToken());
            xOriginList.add(x);
            xSortSet.add(x);
        }
        final List<Integer> xSortList = new ArrayList<>(xSortSet);
        final StringBuilder stringBuilder = new StringBuilder();
        for (Integer findX : xOriginList) {
            final int compressionCount = upperBound(xSortList, findX) - 1;
            stringBuilder.append(compressionCount).append(" ");
        }
        if (stringBuilder.length() > 0)
            stringBuilder.setLength(stringBuilder.length() - 1);

        System.out.println(stringBuilder);
    }

    private static <T> int lowerBound(List<? extends Comparable<? super T>> list, T key) {
        int low = 0;
        int high = list.size();

        while (low < high) {
            int mid = (low + high) >>> 1;
            Comparable<? super T> midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp >= 0)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    private static <T> int upperBound(List<? extends Comparable<? super T>> list, T key) {
        int low = 0;
        int high = list.size();

        while (low < high) {
            int mid = (low + high) >>> 1;
            Comparable<? super T> midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp <= 0)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
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
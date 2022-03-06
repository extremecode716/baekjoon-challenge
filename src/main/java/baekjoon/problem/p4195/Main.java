package baekjoon.problem.p4195;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 친구 네트워크<p>
 * union-find
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4195">https://www.acmicpc.net/problem/4195</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static int[] parent;
    private static int[] cnt;

    private static void solution() {
        final StringBuilder stringBuilder = new StringBuilder();
        final int testCase = Integer.parseInt(Algorithm.readLine());
        for (int i = 0; i < testCase; ++i) {
            final int F = Integer.parseInt(Algorithm.readLine());
            final List<String> inputs = Algorithm.readLines(F);

            parent = new int[F * 2];
            cnt = new int[F * 2];
            Arrays.fill(cnt, 1);
            final Map<String, Integer> nameIndexMap = new HashMap<>();

            int idx = 0;
            for (String input : inputs) {
                final StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
                final String name1 = stringTokenizer.nextToken();
                final String name2 = stringTokenizer.nextToken();

                if (!nameIndexMap.containsKey(name1)) {
                    parent[idx] = idx;
                    nameIndexMap.put(name1, idx++);
                }
                if (!nameIndexMap.containsKey(name2)) {
                    parent[idx] = idx;
                    nameIndexMap.put(name2, idx++);
                }
                union(nameIndexMap.get(name1), nameIndexMap.get(name2));
                stringBuilder.append(cnt[find(nameIndexMap.get(name2))]).append("\n");
            }
        }

        System.out.print(stringBuilder);
    }

    private static void union(int index1, int index2) {
        int parentA = find(index1);
        int parentB = find(index2);
        if (parentA == parentB) return;

        parent[parentB] = parentA;
        cnt[parentA] += cnt[parentB];
    }

    private static int find(int index) {
        if (parent[index] == index) return index;
        return parent[index] = find(parent[index]);
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
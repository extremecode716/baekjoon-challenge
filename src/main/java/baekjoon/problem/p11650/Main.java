package baekjoon.problem.p11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 좌표 정렬하기<p>
 * union-find
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11650">https://www.acmicpc.net/problem/11650</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int testCase = Integer.parseInt(Algorithm.readLine());
        final List<String> inputs = Algorithm.readLines(testCase);
        final List<Vertex> vertexList = new ArrayList<>();
        for (int i = 0; i < testCase; ++i) {
            final StringTokenizer stringTokenizer = new StringTokenizer(inputs.get(i), " ");
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            vertexList.add(new Vertex(x, y));
        }
        Collections.sort(vertexList);

        final StringBuilder stringBuilder = new StringBuilder();
        for (Vertex vertex : vertexList) {
            stringBuilder.append(vertex.x + " " + vertex.y).append("\n");
        }

        System.out.print(stringBuilder);
    }

    static class Vertex implements Comparable<Vertex> {
        private int x;
        private int y;

        public Vertex(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Vertex o) {
            if (x == o.x) {
                return Integer.compare(y, o.y);
            }
            return Integer.compare(x, o.x);
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
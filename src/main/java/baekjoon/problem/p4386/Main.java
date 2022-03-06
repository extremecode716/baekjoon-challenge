package baekjoon.problem.p4386;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/**
 * 별자리 만들기 <p>
 * 메모리 최적화 풀이. Main1 클래스가 원본 코드<p>
 * 알고리즘 분류: 그래프 이론, 최소 스패닝 트리
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4386">https://www.acmicpc.net/problem/4386</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static int[] parent;
    private static List<Edge> edgeList;

    private static void solution() {
        try (final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            final int n = Integer.parseInt(Algorithm.readLine());
            final List<String> inputs = Algorithm.readLines(n);
            final Vertex[] vertices = new Vertex[n];
            parent = IntStream.range(0, n).toArray();
            edgeList = new ArrayList<>();
            int index = 0;
            for (String input : inputs) {
                final StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
                double x = Double.parseDouble(stringTokenizer.nextToken());
                double y = Double.parseDouble(stringTokenizer.nextToken());

                vertices[index] = new Vertex(index, x, y);
                ++index;
            }

            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    double distance = getDistance(vertices[i], vertices[j]);
                    edgeList.add(new Edge(vertices[i].index, vertices[j].index, distance));
                }
            }
            Collections.sort(edgeList);
            double ans = 0;
            for (int i = 0; i < edgeList.size(); i++) {
                Edge edge = edgeList.get(i);
                if (find(edge.start) != find(edge.end)) {
                    ans += edge.distance;
                    union(edge.start, edge.end);
                }
            }

            bw.write(String.format("%.2f", ans) + "\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Vertex {
        private int index;
        private double x;
        private double y;

        public Vertex(int index, double x, double y) {
            this.index = index;
            this.x = x;
            this.y = y;
        }
    }

    private static double getDistance(Vertex v1, Vertex v2) {
        if (v1 == null || v2 == null)
            return 0.0;

        double dX = v1.x - v2.x;
        double dY = v1.y - v2.y;

        return Math.sqrt((dX * dX) + (dY * dY));
    }

    static class Edge implements Comparable<Edge> {
        private int start;
        private int end;
        private double distance;

        Edge(int start, int end, double distance) {
            this.start = start;
            this.end = end;
            this.distance = distance;
        }

        @Override
        public int compareTo(Edge o) {
            if (distance < o.distance) {
                return -1;
            } else if (distance > o.distance) {
                return 1;
            }
            return 0;
        }
    }

    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            parent[y] = x;
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